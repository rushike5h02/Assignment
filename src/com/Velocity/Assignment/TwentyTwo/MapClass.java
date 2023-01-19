package com.Velocity.Assignment.TwentyTwo;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//1. Suppose I have Map<String,Integer> contain key as Ram, Sohan, Ashok, Ajay, Prasanna and value is 3,2,1,6,5 
//	now I want to sort the value from map and print it.

public class MapClass {

	public static void main(String[] args) {
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
			
			hm.put("Ram", 3);
			hm.put("Soham", 2);
			hm.put("Ashok", 1);
			hm.put("Ajay", 6);
			hm.put("Prasanna", 5);
		
			// to sort by key
		Set<String> s = hm.keySet();
		for(String j : s) {
			System.out.println(j);
			System.out.println(hm.get(j));
		}
		
		// Taking the map value in the set by using entrySet() 
		
		Set<Entry<String, Integer>> entry = hm.entrySet();
		
		// Converted set into linked list for sorting operation performed
		List<Entry<String, Integer>> list = new LinkedList<Entry<String, Integer>>(entry);
		
		// Performing the bubble sorting algorithm on values
		
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getValue() > list.get(j).getValue()) { Entry<String, Integer> temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}
		
		// Storing the sorted entry into the map
		System.out.println("Sorted Map by value = "); 
		
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>(); 
		
		for (Entry<String, Integer> v : list) {
			sortedMap.put(v.getKey(), v.getValue());
			}
		
			System.out.println(sortedMap);
		}
		}
