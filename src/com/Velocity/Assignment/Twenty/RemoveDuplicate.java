package com.Velocity.Assignment.Twenty;

import java.util.ArrayList;
import java.util.List;

//Suppose I have arraylist which contain elements as [mumbai, pune, Bangalore, Hyderabad, mumbai], 
//now I want to remove the mumbai from list and print that data.

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>(); 
		list.add("mumbai");
		list.add("pune");
		list.add("bangalore"); 
		list.add("hyderabad");
		list.add("mumbai");
		
			// Remove the mumbai city from array list
		
		for (int i = 0; i < list.size(); i++) {
		
			list.remove("mumbai");
		}
		
		System.out.println("New ArrayList is>>" + list);
		}

}
