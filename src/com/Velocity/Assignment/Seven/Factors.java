package com.Velocity.Assignment.Seven;

import java.util.Scanner;

//Design method to print factors of given number( Enter no = 6 then

// factors should be displayed like 1,2,3,6.


// Factor ==a whole number (except 1) by which a larger number can be divided


public class Factors {
	
	public static void getFactors(int number) {          // Parameters
		int i = 1;
		int count=0;
		while (i <= number) {     // used while loop to iterate until condition remain true
		
		if (number % i == 0) {           // checks if number is divisible by i or not (to find factor)
              System.out.println(i);   // print value of factor in each iteration
              count++;
		}
		       i++;
		}
		System.out.println("counting===="+count);
		}
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		
		// Argument
		int number = scanner.nextInt(); // user entered value stored in local variable number

		System.out.println("The Factors of " + number + " are =");

		 // Display message on console

		getFactors(number);      // calling method for calculating and printing factors of user entered name
	
		scanner.close();
		
		
//		Factors factors = new Factors();		
//		factors.getFactors(8);

	}

}
