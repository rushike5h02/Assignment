package com.Velocity.Assignment.Five;

import java.util.Scanner;

public class EvenOdd {

	    // check whether number is even or odd.
	
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		
		double num=sc.nextDouble();
		
		if(num%2==0) {System.out.println("The Number is Even:");}
		else
			System.out.println("The Number Odd:");
		sc.close();
	}

}
