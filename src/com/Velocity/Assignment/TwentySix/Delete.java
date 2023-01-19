package com.Velocity.Assignment.TwentySix;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {

	public static void main(String[] args) {
		
try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/assignment26", "root", "root");
			
			PreparedStatement pmt = con.prepareStatement("delete from user where id=?");
			
			pmt.setInt(1, 4);
			
			int i=pmt.executeUpdate();
			
			con.close();
			pmt.close();
			
			System.out.println("Deletion Succesfull " + i);
				
		}catch(Exception e){
				System.out.println(e);
			}

		
	}

}
