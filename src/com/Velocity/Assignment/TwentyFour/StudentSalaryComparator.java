package com.Velocity.Assignment.TwentyFour;

import java.util.Comparator;

public class StudentSalaryComparator implements Comparator<Student> {
	
	@Override public int compare(Student o1, Student o2) {
	
		if (o1.getSalary() > o2.getSalary()) 
			return 1;

		else if (o1.getSalary() < o2.getSalary()) 
			return -1;

		else 
			return 0;
}
}