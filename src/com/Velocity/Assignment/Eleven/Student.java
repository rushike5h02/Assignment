package com.Velocity.Assignment.Eleven;

//I have student class now user restrict to create
   // the object of that class from outside, write the code for it.


public class Student {

	private Student() {
	}
}	

// it must give ...Compile time error.. as Constructor Student not Visible....since its private

//  means its access  restricted....private can not be accessed outside class

	
	
	
	// it can be accessed within same class
	
	
//public static void main (String[] args) {
//	Student student = new Student();
//}
//}