package com.Velocity.Assignment.Twenty;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Write program to add the five students mobile number into arraylist and iterate that elements using iterator.

public class MobileNumber {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		for (int i = 1; i <= 5; i++) {
		
			System.out.println("Enter the 5 mobile number>>");
		Scanner scanner = new Scanner(System.in);
		String mobileNumber = scanner.next();
		
		list.add(mobileNumber);
	}
		Iterator<String> iterator = list.iterator();
		
			while (iterator.hasNext()) {
				System.out.println(iterator.next());
		}
		}

}
