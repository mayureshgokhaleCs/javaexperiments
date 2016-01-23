
/* let aa.txt remain in your workspace since it is picked up by file inputstream reader*/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Job;
import org.apache.hadoop.mapreduce.Mapper;
import org.apache.hadoop.mapreduce.lib.input.TextInputFormat;
import org.apache.hadoop.mapreduce.lib.output.TextOutputFormat;
import org.apache.hadoop.util.GenericOptionsParser;

public class CompareText {

	public static class ReplicatedJoinMapper extends Mapper<Object, Text, Text, Text> {

		private HashMap<String, String> textFileInfo = new HashMap<String, String>();

		private Text outvalue = new Text();
		private String joinType = null;

		@Override
		public void setup(Context context) throws IOException, InterruptedException {
			try {
				//
				BufferedReader rdr = new BufferedReader(new InputStreamReader(new FileInputStream(new File("aa.txt"))));
				String line;
				
				while ((line = rdr.readLine()) != null) {

					StringTokenizer st = new StringTokenizer(line);

					while (st.hasMoreElements()) {
						String temp = (String) st.nextElement();
						textFileInfo.put(temp, temp);
						st.nextElement();
					}
				}
			} catch (IOException e) {
				throw new RuntimeException(e);
			}

			// Get the join type
			joinType = context.getConfiguration().get("join.type");
		}

		@Override
		public void map(Object key, Text value, Context context) throws IOException, InterruptedException {
		
			StringTokenizer itr = new StringTokenizer(value.toString());
			while (itr.hasMoreTokens()) {
				String temp = (String) itr.nextElement();
				itr.nextElement();
				String matchingRecord = textFileInfo.get(temp);
				if (matchingRecord != null) {
					outvalue.set(matchingRecord);
					context.write(outvalue, null);
				}
			}

		}
	}

	public static void main(String[] args) throws Exception {
		Configuration conf = new Configuration();
		String[] otherArgs = new GenericOptionsParser(conf, args).getRemainingArgs();
		if (otherArgs.length != 4) {
			System.err.println("Usage: ReplicatedJoin <user data> <comment data> <out> [inner|leftouter]");
			System.exit(1);
		}

		String joinType = otherArgs[3];
		if (!(joinType.equalsIgnoreCase("inner") || joinType.equalsIgnoreCase("leftouter"))) {
			System.err.println("Join type not set to inner or leftouter");
			System.exit(2);
		}

		// Configure the join type
		Job job = new Job(conf, "Replicated Join");
		job.getConfiguration().set("join.type", joinType);
		job.setJarByClass(CompareText.class);

		job.setMapperClass(ReplicatedJoinMapper.class);
		job.setNumReduceTasks(0);

		TextInputFormat.setInputPaths(job, new Path(otherArgs[1]));
		TextOutputFormat.setOutputPath(job, new Path(otherArgs[2]));

		job.setOutputKeyClass(Text.class);
		job.setOutputValueClass(Text.class);

		// Configure the DistributedCache
		// DistributedCache.addCacheFile(new Path(otherArgs[0]).toUri(),
		// job.getConfiguration());

		// DistributedCache.setLocalFiles(job.getConfiguration(), otherArgs[0]);

		System.exit(job.waitForCompletion(true) ? 0 : 3);
	}
}