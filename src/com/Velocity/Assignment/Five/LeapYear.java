
      // Check year as Leap year or not using if-else Statement

package com.Velocity.Assignment.Five;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
       Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Year:");
		
		int year=sc.nextInt();

		if((year%400)==0) {
			System.out.println("Year is Leap Year");
		}
		else if((year%100)==0) {
				System.out.println("Year is Not Leap Year");
		}
		else if((year%4)==0) {
					System.out.println("Year is Leap Year");
				}	
		
		else {
			System.out.println("Year is Not Leap Year");
		}
		sc.close();
	}

}

// if (((year%4==0) && (year%100!=0)) || (year%400==0)){
//System.out.println("It is Leap year");
// }
//else
//{
//System.out.println("It Is Not Leap Year");	
//}
//	}
//}