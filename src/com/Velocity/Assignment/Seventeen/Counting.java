package com.Velocity.Assignment.Seventeen;

import java.io.FileInputStream;
import java.util.Scanner;

public class Counting {

//	1. Write a Java Program for counting the vowels and numbers from file( abc.txt) 	
	
	
	public static void main(String[] args) {
		
		int vowels = 0;
		int numbers = 0;
		
		try {
			
		FileInputStream fis = new FileInputStream("E:\\assignment17.txt");
		
		Scanner sc = new Scanner(fis);
		
		while(sc.hasNextLine()) {
			
			String s = sc.nextLine();
			
			for (int i = 0; i < s.length(); i++) {
				
				char ch = s.charAt(i);
				
				if (ch == 65 || ch == 69 || ch == 73 || ch == 79 || ch == 85 || ch == 97 || ch == 101 || ch == 105
						|| ch == 111 || ch == 117) {
					
					vowels++;
				}
					if (ch >= 48 && ch <= 57) {
						
						numbers++;
					}
			}	
		}		
		System.out.println("The Count of Vowels In File Is = " +vowels);
		System.out.println("The Count of Numbers In File Is = " + numbers );
		
		sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}	
		

