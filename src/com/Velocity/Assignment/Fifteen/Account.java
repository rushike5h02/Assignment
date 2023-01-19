package com.Velocity.Assignment.Fifteen;

//2.1 	Design the Account class which contain id, accountNumber and balance.
//		Design another class called as SavingAccount extends Account that contain withdrawAmount. 
//		Design class AccountDetails class in which below methods. 
//		Public void getAccountDetails () 
//		public static int getWithdrawDetails(Account account) 

public class Account {
	
	int accountNumber;
	int id;
	int balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	

}
