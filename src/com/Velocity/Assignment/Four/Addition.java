package com.Velocity.Assignment.Four;

public class Addition {
	
	public int addition(int a, int b) {        
		int c=a+b;
		return c;
	}

	public static void main(String[] args) {
		
    Addition add= new Addition();
 
    int sum=add.addition(10,20);	
    
    System.out.println("Addition="+sum);
		
	}

}

 