package com.Velocity.Assignment.TwentyOne;

//2.Suppose I have one container that contain  different colors of ballons such as Red, Blue, Green, Red,Blue,Red, Blue, Green .
	//in this order, now sort that balloon in such manner so Red baloon will be added first then Blue baloon and last is Green balloons
	//Use the proper collection.

import java.util.LinkedList;

public class BaloonContainer {
	
	public static void main(String[] args) {

		// Storing the balloon colors in List container
	LinkedList<String> list = new LinkedList<String>();
	
		list.add("Red") ;
		list.add("Blue") ;
		list.add("Green") ;
		list.add("Red") ;
		list.add("Blue") ;
		list.add("Red") ;
		list.add("Blue") ;
		list.add("Green") ;
		
		// Second list for storing the output
	LinkedList<String> list2 = new LinkedList<String>();
	
		// Print the list values
		System.out.println("Elements in List container>>");
		System.out.println(list);
		
		

		for(String str :list) {
			if(str.equals("Red")){
				list2.addFirst("Red");
			}
			else if(str.equals("Blue")) {
				list2.add("Blue");
			}
			else if (str.equals("Green")) {
				list2.addLast("Green");
			}
			
			System.out.println("Balloons after sorting = \n "+list2);
		}
		
		
//	
//	for (String str : list) {
//		if (str.equals("Red")) {
//			list2.addFirst("Red");
//	}
//	else if (str.equals("Blue")) {
//		list2.add("Blue");
//	}
//	
//	
//	for (String str2 : list) {
//		if (str.equals("Green")) {
//			list2.add("Green");
//	}
//	}
//		System.out.println("Output:");
//		System.out.println(list2);
//	}
		
		
		
}
}
