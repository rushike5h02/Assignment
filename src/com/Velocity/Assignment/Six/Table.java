package com.Velocity.Assignment.Six;

//import java.util.Scanner;

// design method void multiplication (int no) and print multiplication table
// Ex. Enter 5===5.10,....,50



                     //for table bet 2 to 5 we can use

//public static void main(String[] args) {		
//for (int no=2; no<=5; no++) {
//		
//		 for(int i=1; i<=10; i++) {
//			 
//				System.out.println(("Table of The No.="+no+"*"+i+"="+no*i));
//			}	  
//		}


public class Table {
              
	         // method Creation
	
  void multiplication (int no) {                // parameter of method
	 
	 
//........		Scanner sc = new Scanner (System.in);
//........		System.out.println("Enter The No. =");
//.......		int no=sc.nextInt();
	 
	 //  But We are Using Parameterized Method We can not us Scanner Class
	
	 // as for table we need to multiply no. by 1,2,3,...10, individually ,,So,
	 
	 for(int i=1; i<=10; i++) {
	 
		System.out.println("Table of The No.="+no+"*"+i+"="+(no*i));
	}	  
	 
}
	 
	 
            // Main Method to Call the Method
 
	public static void main(String[] args) {
		
		Table table= new Table();
		
		table.multiplication(12);     // ..1...Argument for Method  int no
	
//.... instead of 12 we could use Scanner class  and  int no=sc.nextInt();
		
	
	
	
		
		
			 
	}

	}


