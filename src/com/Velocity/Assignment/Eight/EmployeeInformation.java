package com.Velocity.Assignment.Eight;

import java.util.Scanner;

public class EmployeeInformation {
	
	public void getUserInput() {            // to take inputs fron user
		
		// since its ..public ...we can call Employee class in same package
		
		Employee employee = new Employee();
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter First Name==");
		
		employee.firstname= sc.nextLine();
		
        System.out.println("Enter Last Name==");
		
        employee.lastname= sc.nextLine();
		
        System.out.println("Enter City Name==");
		
        employee.city= sc.nextLine();
		
        System.out.println("Enter Mobile Number==");
		
        employee.mobilenumber= sc.nextLong();
	
		
		// pass inputs to getStudentInformation() method.....to store the inputs into method
		
getStudentInformation(employee.firstname, employee.lastname, employee.city, employee.mobilenumber, Employee.country);
	
sc.close();
	}
	
	
	// get all the information into getStudentInformation() method......to call inputs stored in method
	
	public void getStudentInformation(String fname, String lname, String town, long mobno, String country) {
		
		 System.out.println("Student Information==");
		 System.out.println("Firsst name="+fname);
		 System.out.println("Last name="+lname);
		 System.out.println("City="+town);
		 System.out.println("Mobile Number="+mobno);
		 System.out.println("Country="+country);
		 
		 
	}
	

	public static void main(String[] args) {
		

		// printing the student information for multiple student
		
		EmployeeInformation employeeInformation = new EmployeeInformation();	
		
		System.out.println("Enter the number of Student");
		
		Scanner input = new Scanner(System.in);
		
		int count= input.nextInt();
		
		for (int i=1; i<=count; i++) {           // for number of students as desired/required
			
			System.out.println("Enter Student Information==");
			
			employeeInformation.getUserInput();              // to call all user inputs
		
		input.close();
		}
		
	
		
	}

}
