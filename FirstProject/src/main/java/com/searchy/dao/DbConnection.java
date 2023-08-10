package com.searchy.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;

public class DbConnection {

	public boolean check(String username, String password) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		PreparedStatement PT = con.prepareStatement("select * from employeetable where empID=? and passwords =?");
		PT.setString(1, username);
		PT.setString(2, password);
		ResultSet rs = PT.executeQuery();
		System.out.println(rs);
		if (rs.next()) {
			return true;
		}

		return false;
	}

	public static void main(String args[]) {
		 String username= "abc123";
		 String password= "pass123";
		try {
			Class.forName("com.mysql.cj.jdbc.driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			PreparedStatement PT = con.prepareStatement("select * from employeetable where empID=? and passwords =?");
			PT.setString(1, username);
			PT.setString(2, password);
			ResultSet rs = PT.executeQuery();
			System.out.println(rs);		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
