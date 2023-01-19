package com.Velocity.Assignment.Five;

import java.util.Scanner;

public class NumberSwap {

	
	//swap the two numbers
	
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Numbers a=");
		double a=sc.nextDouble();
		System.out.println("Enter the Numbers b=");
		double b=sc.nextDouble();
		
		
	//  Swap Using 3 variables
		
//		double temp;
//		
//		temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println("The Numbers After Swaping:");
//		System.out.println("a after Swap="+a);
//		System.out.println("b after Swap="+b);
		
		
		// Swapping with only 2 variables
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("The Numbers After Swaping:");
		System.out.println("a after Swap="+a);
		System.out.println("b after Swap="+b);
	    
		sc.close();

	}

}
