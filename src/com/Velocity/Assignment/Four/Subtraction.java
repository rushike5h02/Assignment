package com.Velocity.Assignment.Four;

public class Subtraction {
	
	public int subtraction(int a, int b) {
		int c= a-b;
		return c;
	}
	
	public static void main(String[] args) {
		
		Subtraction subtract= new Subtraction();
		
	int sub=subtract.subtraction(20,10);
	
		System.out.println("Subtraction="+sub);
			
	}

}
