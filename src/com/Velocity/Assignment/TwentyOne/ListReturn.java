package com.Velocity.Assignment.TwentyOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;

//1. Design the method which return the list that contain the element as Ram, Sohan, Ashok, Ajay, Prasanna 
//		now I want to sort that element based on descending order.

public class ListReturn {

	public List<String> elements() {
		
		List<String> list = new ArrayList<String>();
			list.add("Ram");
			list.add("Sohan");
			list.add("Ashok");
			list.add("Ajay");
			list.add("Prasanna");
		return list;
		}
	
	public static void main(String[] args) {
		
		ListReturn obj = new ListReturn();
		
		obj.elements();
		Collections.sort(obj.elements());	
		System.out.println("ArrayList = "+obj.elements());
		
		List<String> ascendingList = obj.elements();
		Collections.sort(ascendingList);
		
		System.out.print("List in descending order==");
		
		for(int i= ascendingList.size()-1; i>=0; i--) {
			System.out.print(ascendingList.get(i) + " ");
		}
		
		System.out.print(" \n List in ascending order==");
		
		for(int j=0; j<=ascendingList.size()-1;j++) {
			System.out.print(ascendingList.get(j) + " ");
		}
		
		
//		SortList sortList = new SortList();
//			// Stored the list element into new List variable
//		List<String> asendingList = sortList.elements();
//		
//		// Sort the list in ascending order
//		Collections.sort(asendingList);
//		
//			System.out.println("List in ascending order>>" + asendingList);
//		
//		// Print the list in ascending order
//			System.out.print("List in descending order>>");
//		
//			for (int i = asendingList.size() - 1; i >= 0; i--) {
//				System.out.print(asendingList.get(i) + " ");
//		}
		}

}
