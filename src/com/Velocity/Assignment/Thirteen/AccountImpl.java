package com.Velocity.Assignment.Thirteen;

import java.util.Scanner;

public class AccountImpl implements SavingAccount {

	// add unimplemented methods
	
	@Override
	public void getSavingAccount() {
		
		//  input should be taken from user as name and balance
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Name :");
		String name = sc.nextLine();
		
		System.out.println("Enter the Balance :");
		float balance = sc.nextFloat();
		
		// to pass input and print it into getUserDetails method
		
		getUserDetails(name, balance);
		
		sc.close();
	}

	@Override
	public void getUserDetails(String name, float balance) {
		
		// Print inputs..name, balance
		
		System.out.println("The Name is ="+" "+ name);
		System.out.println("The Balance is ="+" "+ balance);
		
	}
	
	public static void main(String[] args) {
		
		AccountImpl account = new AccountImpl();
		
		account.getSavingAccount();
	}
	

}
