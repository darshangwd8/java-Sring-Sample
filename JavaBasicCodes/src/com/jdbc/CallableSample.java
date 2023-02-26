package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CallableSample {
	public static Connection con =null;
	public static CallableStatement cst =null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management_system","root","root");
			System.out.println("Database is connected");
			cst=con.prepareCall("{call insertrecord(?, ?, ?)}");
			cst.setInt(1, 7);
			cst.setString(2, "John");
			cst.setString(3,"welcomeXYZ");
			cst.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
