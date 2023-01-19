package com.Velocity.Assignment.Five;

import java.util.Scanner;

public class MaxNumber {

	
	// find out maximum number among three number(if else if ladder statement)
	
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Numbers:");
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		
//		int a=10;
//		int b=20;
//		int c=30;
		
		if(a>b && a>c) { System.out.println("Largest number is a="+a);}
		else if(b>a && b>c) {System.out.println("Largest number is b="+b);}
		else if(c>a && c>b) {System.out.println("Largest number is c="+c);}
		
		
		sc.close();
		

	}

}
