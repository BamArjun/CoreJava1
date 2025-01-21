package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDB {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Register Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_db", "root", "981273");

////	 --------------insert sql-----------
////	  write sql
//String sql="insert into user(username,password) values('hari','434')";
////create statement
//Statement stmt=con.createStatement();
////	   execute  sql 
//stmt.execute(sql);
////	  close database
//
//con.close();

//-------delete sql---------------	 
//	 String sql="delete from user where id=2";
//	 Statement stmt=con.createStatement();
//	 stmt.execute(sql);

		// ---------update sql----------
//		String sql = "update user set Password='morning' where id=3";
//		Statement stmt = con.createStatement();
//		stmt.execute(sql);
//		System.out.println("success");

		String sql = "select *from user ";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		while (rs.next()) {

			System.out.println("Id=" + rs.getInt("Id"));
			System.out.println("userName=" + rs.getString("Username"));
			System.out.println("Password=" + rs.getString("Password"));
			System.out.println("------\n------");
		}

	}
}