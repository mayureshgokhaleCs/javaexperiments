package P1.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import P1.Point;

public class DAO {
   String tablename;

	
	public void insert(int x, int y, String statement) throws SQLException {
		Statement stmt = connect();
		stmt.executeUpdate("insert into "+ tablename
				+"(x,y,statement) values ('" + String.valueOf(x) + "',"
				+ String.valueOf(y) + ",'" + statement + "')");
	}

	public void create(String tablename) throws SQLException {
		this.tablename = tablename;
		Statement stmt = connect();
		 String tableExp = "create table IF NOT EXISTS " + tablename + "( "
				+ "x VARCHAR(20),y VARCHAR(20)," + "statement VARCHAR(20))";

		stmt.executeUpdate(tableExp);
	}

	public Point read() throws SQLException {
		AbstractApplicationContext ac = new FileSystemXmlApplicationContext(
				"one.xml");
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jdbcTemplate");
		SqlRowSet s = jt.queryForRowSet("Select * from " + tablename);
		Point point=(Point)ac.getBean("point");
		while (s.next()) {
		point.setX(Integer.parseInt(s.getString("x")));
		point.setY(Integer.parseInt(s.getString("y")));
	    point.setComment(s.getString("statement"));
		}
		return point;
	}

	private Statement connect() throws SQLException {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			// establish connection
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mydb", "root", "mayuresh");
			System.out.println("success");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (con.createStatement());
	}

}
