package com.Velocity.Assignment.TwentySix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Retrival {

	public static void main(String[] args) {
		
try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment26", "root", "root");
		
		PreparedStatement pmt = con.prepareStatement("select * from user");
		
		ResultSet rs = pmt.executeQuery();
		
		System.out.println("Retrived Data =  " +"\n");
		
		while(rs.next()) {
			
			System.out.println("ID            = " + rs.getInt(1));
			System.out.println("First Nam     = " + rs.getString(2));
			System.out.println("Last Name     = " + rs.getString(3));
			System.out.println("City          = " + rs.getString(4));
			System.out.println("Mobile Number = " + rs.getInt(5));
			System.out.println("-----------------");
		}
		
		
		
		con.close();
		pmt.close();
		
	
			
	}catch(Exception e){
			System.out.println(e);
		}

	}

}
