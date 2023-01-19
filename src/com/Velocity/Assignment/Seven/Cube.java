package com.Velocity.Assignment.Seven;

public class Cube {

	
	public int getNumberCube(int num) {
	 
		int no=num*num*num;
		
		return no;
	}
	
	
	public static void main(String[] args) {
		
		Cube cube= new Cube();
		
		int result=cube.getNumberCube(5);
		
		System.out.println("Cube is ="+result);

	}

}



