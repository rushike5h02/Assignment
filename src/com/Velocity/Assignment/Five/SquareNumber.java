package com.Velocity.Assignment.Five;

import java.util.Scanner;

public class SquareNumber {

	// print the square of any number
	
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		
		double num=sc.nextDouble();
		
		double square=num*num;
		
		System.out.println("Square of The Number is:"+square);
		
		System.out.println("Square of The Number is:"+(num*num));

		sc.close();
	}

}
