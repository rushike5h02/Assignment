package com.Velocity.Assignment.Nine;

//  Write the Java program in which create the multiple objects and 
    // display the count of number of objects created into class

public class CountObject {
	
	private static int countObjects=0;              // to count the objects
	
	// we need Default constructor...to count objects
	
	CountObject(){          //..default..constructor gives count of objects
		countObjects++;
	}

	public static void getObjectCount() {       // static method ...it wont require seperate object to call method
		
		System.out.println("Number of Object is=" + countObjects);        // to print the no. ob objects
	}

	public void main(String[] args) {
		
		// we will take number of objects
		
		CountObject obj1= new CountObject();
		CountObject obj2= new CountObject();
		CountObject obj3= new CountObject();
		CountObject obj4= new CountObject();
		CountObject obj5= new CountObject();
		CountObject obj6= new CountObject();
		
		// to call method
		
		//System.out.println("Number of Object is=" + CountObject.countObjects);
		
		getObjectCount();
	}
	
	
}
