package com.Velocity.Assignment.Sixteen;

public class Product {
	
//	1.  Design the Product class in which design void productCheck(int weight) in check 
//		whether weight is less than 100, then throw the ProductException  with a meaningful message. 
//	2.  Design the ProductException class in which write custom exceptions.
//	3.  Create MainProduct class in which pass the input to productCheck method with try and catch block.
	
	
	public void productCheck(int weight) {
		
		if (weight<100) {
			
			throw new ProductException ("Weight less than 100 unit");      // need to create new ProductException Class 
			                                                                    // to remove Compile Time Error
		}
	}

}
