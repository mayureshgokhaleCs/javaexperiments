import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class Factory {
	static int i = 0;
	static ArrayList<String> loadClasses = new ArrayList<String>();

	static ServiceStack getStack(boolean t) {
		/*
		 * earlier version switch(i){ case 0: return new Stack(); default:
		 * return new StackUsingLinklist(); }
		 */
		// check the interface implemented by loaded class if it implements both
		// qos and serviceStack go ahead else stop
		// then check if get qos is true or false and match with boolean t and
		// return the object
		for (String s : loadClasses) {
			try {
				Class c = Class.forName(s);
				Object obj = c.newInstance();
				Class[] interfaces = c.getInterfaces();
				HashMap<String, String> iList = new HashMap<String, String>();
				for (Class i : interfaces) {
					String[] split = i.toString().split("\\s");

					iList.put(split[1], null);
				}
				if (iList.containsKey("QOS")
						&& iList.containsKey("ServiceStack")) {
					Method[] methods = c.getMethods();
					for (Method i : methods) {
						if (i.toString().contentEquals(
								"public boolean Stack.getQos()")
								|| i.toString()
										.contentEquals(
									"public boolean StackUsingLinklist.getQos()")) {
							Object result = i.invoke(obj);
							if (result.toString().equals("true")) {
								if(result.toString().equals(String.valueOf(t)))
                                   return new Stack();
							}
							if(result.toString().equals("false")){
								if(result.toString().equals(String.valueOf(t)))
								return new StackUsingLinklist();
							}
						}
					}

				} else {
					System.out.println("IgnoredClass" + s);
				}

			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

	public static void init() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("class.txt"));
		String line = br.readLine();
		while (line != null) {
			loadClasses.add(line);
			line = br.readLine();
		}
		System.out.println("classes loaded so far");
		for (String s : loadClasses) {
			System.out.println(s);
		}
	}
}
