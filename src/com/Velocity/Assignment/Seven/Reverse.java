package com.Velocity.Assignment.Seven;

import java.util.Scanner;

//Design method public int getReverseNumber(int num) which return int value to that method 
// and result print into main method.

public class Reverse {
	
	public static int getReverseNumber(int num) {       // Parameters
		int reverse = 0;
		while (num != 0) {
			
		reverse = reverse * 10;
		reverse = reverse + num % 10;
		num = num / 10;
		}
		return reverse;
		}

	public static void main(String[] args) {
		
		System.out.println("Enter the number to reverse=");

				Scanner scanner = new Scanner(System.in);
				
				int num = scanner.nextInt();               // Argument
				
				int reverseNumber = getReverseNumber(num);     // calling the method

				System.out.println("Reverse number is =" +reverseNumber);

				
				scanner.close();
	}

}
