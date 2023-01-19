package com.Velocity.Assignment.Four;


public class TotalAverage {
	
	
	public static void main(String[] args) {
		
		int MP01=31;
		int MP03=29;
		int MP04=29;
		int MP07=35;
		int MG13=27;
		
		int total=MP01+MP03+MP04+MP07+MG13;
		double average=(total/5.0);
		
		double percentage=((total/250.0)*100);
		
		System.out.println("Total Marks="+total);
		System.out.println("Average Marks="+average);
		
		System.out.println("Percentage Marks="+percentage);
		
		
		

	}

}
