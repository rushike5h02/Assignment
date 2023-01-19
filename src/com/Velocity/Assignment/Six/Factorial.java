package com.Velocity.Assignment.Six;

// method int factorial (int no) which return value  to that method
// print result into  Main Method
// Ex. Enter 5!===5*4*3*2*1


public class Factorial {

// method Creation
	
	// since "void" can not "return"   we use "int" method
	
public int factor(int no) {                  //  Parametres  Of method
	
	// to initiate factor we need Variable "fact" then "return" value to "fact" after each operation in "For Loop"
	
	int fact = 1;
	
	for(int i=1; i<=no; i++) {
		 
		fact=fact*i;
	}
	return fact;
	
}
	
	public static void main(String[] args) {
		
		Factorial factorial = new Factorial();
		
		int result=factorial.factor(5);                    // Argument / value   of Method
		
		
		
		System.out.println("Factorial of No.="+result);       
	}

}
