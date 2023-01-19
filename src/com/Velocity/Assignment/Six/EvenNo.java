package com.Velocity.Assignment.Six;

    // print Even No. Between 50 to 75


public class EvenNo {

	public static void main(String[] args) {
		
		for(int i=50; i<=75; i++) {           // we define the end values
			if(i%2==0) {                   // if will allow only those number with remainder Zero
				     //if (i%2==1) {                      // For odd no. it will be  i%2==1;
				System.out.println("Even Number is=="+i);
			}
		}
		

	}

}
