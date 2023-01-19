package com.Velocity.Assignment.Ten;

import java.util.Scanner;

// 3......Print Armstrong numbers...it is equal to the sum of cubes of its digits....0, 1, 153, 370, 371, 407 etc.  


public class ArmstrongNumber {

		// Create a method to get status of is number Armstrong or not
		
	public boolean isArmstrongNumber(int input) {
		int tempValue = input;
		int sum = 0;        // initialized the sum variable for addition of cube of digits
		
		while (input != 0) {
		
		int remainder = input % 10;        // Getting digit by applying remainder logic
		sum = sum + (remainder * remainder * remainder);    // sum of all cube of digit
		input = input / 10;
		}
		
		// return the status of input value.
		
		if (sum == tempValue)
		return true;
		else
		return false;
		}
		
		public static void main(String[] args) {
			
		ArmstrongNumber armStrongNumber = new ArmstrongNumber();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int value = scanner.nextInt();
		
		scanner.close();
		
		// check whether input value is Armstrong or not
		
		if (armStrongNumber.isArmstrongNumber(value))
		System.out.println(value + " is armstrong number.");
		else
		System.out.println(value + " is not armstrong number.");
		}
		
		

		
	}


