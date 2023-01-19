package com.Velocity.Assignment.TwentyThree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

// Design the below example by using HashMap<String, ArrayList<String>>
//India
//Maharashtra...Mumbai,Pune,Nagpur
//Karnataka.....Bangalore,Mysore
//Madhya Pradesh......Bhopal,Indore


public class IndiaHashMap {

	public static void main(String[] args) {
	
		
		ArrayList<String> mhlist = new ArrayList<String>(); 
			mhlist.add("Mumbai");
			mhlist.add("Pune");
			mhlist.add("Nagapur");

		ArrayList<String> knlist = new ArrayList<String>();
			knlist.add("Bangalore");
			knlist.add("Mysore");
			
		ArrayList<String> mplist = new ArrayList<String>();
			mplist.add("Bhopal");
			mplist.add("Indore");
		
		
		HashMap<String,ArrayList<String>> statehm = new HashMap<String,ArrayList<String>>();
			statehm.put("MH", mhlist);
			statehm.put("KN", knlist);
			statehm.put("MP", mplist);
			
		HashMap<String, HashMap<String, ArrayList<String>>> indiaMap = new HashMap<String, HashMap<String,ArrayList<String>>>();
			indiaMap.put("India", statehm);
			
			IndiaHashMap ihm = new IndiaHashMap();
			
			Set<String> s= indiaMap.keySet();
			
			for(String str : s) {
			System.out.println("Key = " + str);
			System.out.println("Values = "+indiaMap.get(str));
			}
	}

}
