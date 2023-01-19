package com.Velocity.Assignment.Ten;


// 2... program for fibonacci series


public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0, n2=1, n3, i, count=10;    // declaring variables and...count=10...means no. up to which we want series
		
		// to print in format of ..0 1 2 3 4 
		
		// we will be using .....system.out.print..to print on same line.....instead of println..used for next line
		
		System.out.print(n1+" "+n2);       
		
		for(i=2; i<count;i++) {           // int i=2....since we have n1=0 and n2=1,  so we have first 2 numbers
			n3= n1+n2;
			
			System.out.print(" "+ n3);           // to print n3 separately
		
			n1=n2;
			n2=n3;
		}
		
	}

}
