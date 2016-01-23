import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class hello {
	 private static final String tableExp= "create table Mayu ( "
      + "   id INT PRIMARY KEY, firstName VARCHAR(20), lastName VARCHAR(20), "
      + "   title VARCHAR(20), salary INT )";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	try{
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver loaded");
		// establish connection
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mydb", "root", "mayuresh");
		System.out.println("success");
		Statement stmt = con.createStatement();
	     /*stmt.executeUpdate(tableExp); 
	      stmt.executeUpdate("insert into Mayu(id, salary) values(101, 30000)");
	      stmt.executeUpdate("insert into Mayu(id, salary) values(201, 999999)");
	      System.out.println("CreateEmployeeTableMySQL: main(): table created.");*/
		// create statement
	      
	      ResultSet rws= stmt.executeQuery("SELECT * FROM Mayu");
	        System.out.println("inserted");
	        while(rws.next()){
	        	System.out.println(rws.getInt("id")+"--"+rws.getString("salary"));
	        	
	        }
	}catch(Exception e){
		System.out.println(e);
	}
	}

}
