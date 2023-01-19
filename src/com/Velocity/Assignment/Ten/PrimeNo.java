package com.Velocity.Assignment.Ten;


// 1... Print to find number is Prime Number or Not


import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Number==");
		
		int no=sc.nextInt();
		
		int count=0;
		
		for(int i=no; i>0; i--) {
			
			if (no%i==0) {
				count++;
			
			if(count>2) {
				System.out.println("No. is Not Prime Number");
			}
			else {
				System.out.println("No. is Prime Number");
			}
			
			sc.close();
			}
		}
	}	

	}



