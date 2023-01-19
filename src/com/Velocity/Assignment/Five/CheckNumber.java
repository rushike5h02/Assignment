package com.Velocity.Assignment.Five;

import java.util.Scanner;

public class CheckNumber {

      // check whether the no is greater than 100	
	
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number:");
		
		double num=sc.nextDouble();
		
		if(num==100)       { System.out.println("The Number is 100");               }
		else if(num>100)   {System.out.println(" The Number is Greater Than 100");  }
		else if(num<100)   {System.out.println("The Number is Lesser Than 100");    }
		sc.close();
	}
	
}
