import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;


class ConnectToDb{
	
	
	public static void main(String args[]){
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		// establish connection
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mydb", "root", "mayuresh");
		System.out.println("success");
		}catch(Exception e){
			System.out.println( e);
		}
		AbstractApplicationContext ac = new FileSystemXmlApplicationContext(
				"one.xml");
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
		SqlRowSet s = jt.queryForRowSet("Select * from Point");
	while(s.next()){
		System.out.println(s.getString("x")+s.getString("y")+s.getString("statement"));
	}
	}
	
}
