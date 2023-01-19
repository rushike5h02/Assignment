package com.Velocity.Assignment.Eighteen;

//1. Suppose You have given an integer array containing 1 to n but one of the number from 1 to n in the array is missing.
//	You need to provide optimum solution to find the missing number. Number can not be repeated in the array.

public class MissingElement {

	public static void main(String[] args) {
		
	int[] a = { 1, 2, 4, 6, 3, 7, 8, 9 }; // array declaration and initialization
	int size = a.length; // storing array length in variable
		
		for (int num = 1; num <= size; num++) { // checking number from 1 to max number in array
		
			int count = 0; // variable to count the occurance of number
		
			for (int j = 0; j < size; j++) { // a loop to compare each array element
		
				if (num == a[j]) {// condition to check number present with array element
		
					count++;
		
				}
		
			}
		
			if (count == 0) { // if the number is not present.i.e. count is zero
		
				System.out.println("Missing number is>> " + num); // Print the number
		
			}
		}
		}

}
