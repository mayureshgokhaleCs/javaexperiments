import java.sql.SQLException;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import P1.dao.DAO;


public class test {

	
	public static void main(String[] args) throws SQLException {
		//code to connect database via xml and acces data
	/*	AbstractApplicationContext ac = new FileSystemXmlApplicationContext("one.xml");
		JdbcTemplate jt=(JdbcTemplate)ac.getBean("jdbcTemplate");
		//jt.update("insert into Mayu(id, salary) values(555, 30000)");
		SqlRowSet s=jt.queryForRowSet("Select * from Mayu");
		while(s.next()){
			System.out.println(s.getInt("id"));
			System.out.println(s.getInt("salary"));
			
		}
	}*/

		//using DAO
		DAO point=new DAO();
		point.create("Point");
		System.out.println("table created");
		point.insert(20, 30, "daodao");
		System.out.println("inserted");
		System.out.println(point.read().toString());
		
}
}