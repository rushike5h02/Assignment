package com.Velocity.Assignment.Thirteen;


// Design the interface which contain below method public void getSavingAccount();
// public void getUserDetails(String name,float balance); Then design the new class called as AccountImpl
//  and implement that method, below input should be taken from user as name and balance
//  into getSavingAccount method and pass input and print it into getUserDetails method



public interface SavingAccount {

	abstract public void getSavingAccount();
	abstract public void getUserDetails(String name,float balance);
}
