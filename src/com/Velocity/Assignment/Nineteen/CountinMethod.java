package com.Velocity.Assignment.Nineteen;

import java.util.Scanner;

//1. Design a method for counting the alphabet, vowels and numbers from String. Input should be from user 
//	into main method and pass that to methods. And result will print into main method 

public class CountinMethod {

		// Declaring the static variables for counting the vowels, alphabets & numbers
	private int countAlphabet;
	private int countVowels;
	private int countNumers;
	
		// Method for counting alphabets
	public int getAlphabetCounts(String inputData) {
		
		// Iterate the loop for reading the values from input string
	for (int i = 0; i < inputData.length(); i++) {
		// Get count for alphabet & vowels
	if (inputData.charAt(i) <= 'Z' && inputData.charAt(i) >= 'A'|| inputData.charAt(i) <= 'z' && inputData.charAt(i) >= 'a')
	
	countAlphabet++;
	}
	return countAlphabet;
	}
		// Method for counting vowels
	
	public int getVowelsCounts(String inputData) {
		// Iterate the loop for reading the values from input string
	for (int i = 0; i < inputData.length(); i++) {
		if (inputData.charAt(i) == 'a' || inputData.charAt(i) == 'e' || inputData.charAt(i) == 'i'
				|| inputData.charAt(i) == 'o' || inputData.charAt(i) == 'u' || inputData.charAt(i) == 'A'
				|| inputData.charAt(i) == 'E' || inputData.charAt(i) == 'I' || inputData.charAt(i) == 'O'
				|| inputData.charAt(i) == 'U')
	countVowels++;
	}
	return countVowels;
	}
		// Method for counting numbers
	
	public int getNumbersCounts(String inputData) {
		// Iterate the loop for reading the values from input string
	for (int i = 0; i < inputData.length(); i++) {
		// Get count for numbers
	if (inputData.charAt(i) <= '9' && inputData.charAt(i) >= '0')
	countNumers++;
	}
	return countNumers;
	}
	
	public static void main(String[] args) {
		// Object creation for Program1 class
	CountinMethod countingString = new CountinMethod();
		// Taking user input string
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter input string: ");
	String inputValue = scanner.nextLine();
	
		// get vowels, alphabets & number counts from input string
	System.out.println("Alphabets Count in input string: " + countingString.getAlphabetCounts(inputValue));
	System.out.println("Vowels Count in input string: " + countingString.getVowelsCounts(inputValue));
	System.out.println("Numbers Count in input string: " + countingString.getNumbersCounts(inputValue));
	}
	
}
