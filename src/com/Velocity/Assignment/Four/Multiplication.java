package com.Velocity.Assignment.Four;

public class Multiplication {
	
	public int multiplication (int a, int b) {
		int c= a*b;
		return c;
	}
	
	public static void main(String[] args) {
		
		Multiplication multiply= new Multiplication();
		
	int multi=multiply.multiplication(10,20);
	
		System.out.println("Multiplication="+multi);
			
	}

}
