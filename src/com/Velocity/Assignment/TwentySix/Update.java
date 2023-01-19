package com.Velocity.Assignment.TwentySix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment26", "root", "root");
			
			PreparedStatement pmt = con.prepareStatement("update user set firstname=? where id=?");
			
			pmt.setString(1, "rushikesh");
			pmt.setInt(2, 1);
			
			int i=pmt.executeUpdate();
			
			con.close();
			pmt.close();
			
			System.out.println("Update Succesfull " + i);
				
		}catch(Exception e){
				System.out.println(e);
			}

	}

}
