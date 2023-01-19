package com.Velocity.Assignment.Nineteen;

import java.util.Scanner;

//2. Design the java method for String getReverseString(String reverse) and take the input from user 
//into main method and pass to that method. Result will print into main method

public class ReverseString {
	
	public String getReverseString(String input) {
	String reverse = "";
	
	for (int i = input.length() - 1; i >= 0; i--) {
		reverse = reverse + input.charAt(i);
	}
	return reverse;
	}

	public static void main(String[] args) {
		// Object creation for ReverseString class
		
	ReverseString reverseString = new ReverseString();
		// Input value from user
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the input string: ");
	String inputValue = scanner.nextLine();
		// Reverse of input string
	System.out.println("Reverse of '" + inputValue + "' is: " + reverseString.getReverseString(inputValue));
		}

}
