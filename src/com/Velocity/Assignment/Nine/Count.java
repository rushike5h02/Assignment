package com.Velocity.Assignment.Nine;

public class Count {

  
		static int count=0;  
		
		static void count()  
		{  
		count++;  
		}  
		  
		
		public static void main(String args[])  
		{  
			Count c1=new Count();   
		c1.count();  
		Count c2=new Count();  
		c2.count();  
		Count c3=new Count();   
		c3.count();  
		System.out.println("Total Number of Objects: "+count);  
		}  
		//function counts the number of objects  
		
}
