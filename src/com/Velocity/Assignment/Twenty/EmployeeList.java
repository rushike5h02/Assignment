package com.Velocity.Assignment.Twenty;

import java.util.ArrayList;
import java.util.Scanner;

//Design the method for ArrayList<Employee> which returns the list of employee and print that data

public class EmployeeList {
	
	private String employeeName;
	
	public EmployeeList(String employeeName) {
		this.employeeName = employeeName;
	}
		@Override
	public String toString() {
			return "Employee [employeeName=" + employeeName + "]";
	}
	
		public static void main(String[] args) {
			// creating object of scanner class
	
		Scanner scanner = new Scanner(System.in);
			// Creating array list for storing employee names
	
		ArrayList<EmployeeList> arrayList = new ArrayList<EmployeeList>();
		System.out.println("Enter the 3 employee names>>");
		
		for (int i = 1; i <= 3; i++) {
			arrayList.add(new EmployeeList(scanner.nextLine()));
	}
		// Iterating the array list value and print on the console
	System.out.println("Employee names into Array list: ");
		for (EmployeeList employee : arrayList) {
			System.out.println(employee);
	}
	}
}
