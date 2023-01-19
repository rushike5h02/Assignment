package com.Velocity.Assignment.TwentySix;

/* 1. Design the user table that contain id, first name, last name, city and mobile number. 
 * perform the CRUD operation using JDBC. */

import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;

public class Insert {

	public static void main(String[] args) {
		
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment26", "root", "root");
		
		PreparedStatement pmt = con.prepareStatement("insert into user (firstname,lastname,city,mobileno) values(?,?,?,?)");
		
		pmt.setString(1, "rushikesh");
		pmt.setString(2, "bhand");
		pmt.setString(3, "ahmednagar");
		pmt.setInt(4, 12345);
		
		int i=pmt.executeUpdate();
		
		con.close();
		pmt.close();
		
		System.out.println("Insertion Succesfull"+ i);
			
	}catch(Exception e){
			System.out.println(e);
		}
		

	}

}
