package com.Velocity.Assignment.Sixteen;

import java.util.Scanner;

public class MainProduct {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Weight of Product = ");
		
		int productWeight = sc.nextInt();
		
		try {
			product.productCheck(productWeight);
			
			System.out.println("Product weight is = " + productWeight);
		
		}
		catch(ProductException e){
			e.printStackTrace();
		}
		
		

	}

}
