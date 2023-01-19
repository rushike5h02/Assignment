package com.Velocity.Assignment.Five;

import java.util.Scanner;

public class PosNeg {

	
	// Check Number as Positive or Negative
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		
		double num=sc.nextDouble();
		
		if(num>0) {
			System.out.println("Number is Positive");
		}
		else {
			System.out.println("Number is Negative");
		}
		
		sc.close();
	}

}
