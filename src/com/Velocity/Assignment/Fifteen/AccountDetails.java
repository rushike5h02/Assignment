package com.Velocity.Assignment.Fifteen;

import java.util.Scanner;

public class AccountDetails {
	
	
	
	public void getAccountDetails () {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter The Account ID=");
	int id = sc.nextInt();
	
	System.out.println("Enter The Account Number=");
	int accountNumber = sc.nextInt();
	
	System.out.println("Enter The Account Balance=");
	int balance = sc.nextInt();
	
	Account account = new Account();
	
	account.setAccountNumber(accountNumber);
	account.setId(id);
	account.setBalance(balance);
	
	getWithdrawDetails(account);
	
	}
	
	public static int getWithdrawDetails(Account account) {
		int currentBalance = 0;
		Scanner sc1 = new Scanner(System.in);
		
		System.out.println("Enter The Withdraw Amount=");
		
		int withdrawAmount = sc1.nextInt();
		
		if(account.getBalance()  > withdrawAmount) {
			
			currentBalance = account.getBalance() - withdrawAmount;
			
		}
		
		System.out.println("Your Current Balance= " + currentBalance );
		
		return currentBalance;
		
		
	
	
	
	
	}	
}
