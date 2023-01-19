package com.Velocity.Assignment.Twenty;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

//Design the generics arraylist for string and add five cities into it and iterate that using for each loop

public class City {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
			for (int i = 1; i <= 5; i++) {
				System.out.println("Enter the 5 city>>");
		
			Scanner scanner = new Scanner(System.in);
			String city = scanner.next();
			list.add(city);
		}
		
			Iterator<String> iterator = list.iterator();
				
			while (iterator.hasNext()) {
					System.out.println(iterator.next());
		}
		}

}
