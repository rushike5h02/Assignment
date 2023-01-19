package com.Velocity.Assignment.Fourteen;

//...Write a java program to print the all multiplication table from * 2, 3, 4.... to 20

public class Table {

	public void multiplicationTable() {
		
		for(int x=2; x<=20; x++) {
			
			System.out.println("Table of "+x+"=");
			System.out.println();
			
			for(int i=1; i<=10; i++) {
				
				int result = x*i;
				
				System.out.println(result + " \t ");			
			}
			System.out.println();			
		
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Table table = new Table();
		
		table.multiplicationTable();

		
		
	}

}
