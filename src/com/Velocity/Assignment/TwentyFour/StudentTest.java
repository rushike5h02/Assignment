package com.Velocity.Assignment.TwentyFour;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


	public class StudentTest {
		
		public static void main(String[] args) {
			
			List<Student> list = new ArrayList<Student>();
			
				list.add(new Student(101, "Fluorine", 5000));
				list.add(new Student(102, "Chlorine", 10000));
				list.add(new Student(103, "Iodine", 4000));
				list.add(new Student(104, "Bromine", 15000));

				// Sort the element by sort method
			Collections.sort(list, new StudentSalaryComparator());
			
			// Print the element After sorting based on student salary
			System.out.println("After Sorting based on student salary:");
			
			for (Student std : list) {
				System.out.println(std);
}
}
}