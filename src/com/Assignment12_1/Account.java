package com.Assignment12_1;

import java.util.Scanner;

//Account
//int : accountNumber
//String: accountName
//void :getAccountDetails()
//void: getAccountInformation()

	
public class Account {
int accountNumber;
String accountName;
//getting input from user
public void getAccountDetails() {
System.out.println("Enter the account number>>");
Scanner scanner = new Scanner(System.in);
accountNumber = scanner.nextInt();
System.out.println("Enter the account holder name");
accountName = scanner.next();
getAccountInformation(accountNumber, accountName);
}
// Printing the account details
private void getAccountInformation(int accountNumber, String accountName) {
System.out.println("Account Number: " + accountNumber);
System.out.println("Account Name: " + accountName);
}
}