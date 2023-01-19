package com.Velocity.Assignment.TwentyFour;


import java.util.ArrayList;
import java.util.Collections; import java.util.List;


	public class EmployeeTest {
	
	public static void main(String[] args) {
	
		List<Employee> list = new ArrayList<Employee>();
	list.add(new Employee(101, "rushiksh", "nagar"));
	list.add(new Employee(103, "swapnil", "buldhana"));
	list.add(new Employee(104, "avaish", "mumbai"));
	list.add(new Employee(102, "deepak", "jalgaon"));

	
	// Print the element After sorting based on employee name
	System.out.println("After Sorting based on employee name = ");
	
	Collections.sort(list);
	for (Employee emp : list) {
	System.out.println(emp);
	}
}
}