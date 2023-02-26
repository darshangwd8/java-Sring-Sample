package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementSample {
	//public static String Db_Url ="jdbc:mysql://localhost:3306/UserEntry\",\"root\",\"root";
	public static Connection con =null;
	public static Statement stmt =null;
	public static ResultSet rs=   null;
	public static void main(String[] args) {
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system","root","root");
			System.out.println("Database is connected");
			stmt=con.createStatement();
			/*String sql = "Insert into login values('1','darshangwd','darsh1234')";
			int result=stmt.executeUpdate(sql);
			System.out.println(result);
			*/
			String sql ="Select * from login";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("id") + "     " + rs.getString("uname") + "         " + rs.getString(3) );
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
