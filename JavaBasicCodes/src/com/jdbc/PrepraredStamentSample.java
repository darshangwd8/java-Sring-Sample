package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepraredStamentSample {
	public static Connection con =null;
	public static PreparedStatement prepstmt =null;
	public static String qry="insert into login values(?,?,?)";

	public static void main(String[] args) {
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system","root","root");
			System.out.println("Database is connected");
			prepstmt = con.prepareStatement(qry);
			for(int i=4;i<7;i++) {
				prepstmt.setInt(1, i);
				prepstmt.setString(2, "james");
				prepstmt.setString(3, "abcd");
				prepstmt.executeUpdate();
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
