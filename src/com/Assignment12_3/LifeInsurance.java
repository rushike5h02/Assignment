package com.Assignment12_3;

import java.util.Scanner;

//	LifeInsu rance
//	Int: premiumAmount
//	Void: getLifeInsuranceDetails()
//	Void:
//	getLifeInsuranceInformation()

public class LifeInsurance extends Insurance{

	int premiumAmount;
	public int getPremiumAmount() {
	return premiumAmount;
	}
	public void setPremiumAmount(int premiumAmount) {
	this.premiumAmount = premiumAmount;
	}
	public void getLifeInsuranceDetails() {
	System.out.println("Enter the Insurance details>>");
	Scanner scanner = new Scanner(System.in);
	premiumAmount = scanner.nextInt();
	LifeInsurance lifeInsurance = new LifeInsurance();
	lifeInsurance.setPremiumAmount(premiumAmount);
	getLifeInsuranceInformation(lifeInsurance);
	}
	private void getLifeInsuranceInformation(LifeInsurance lifeInsurance) {
	System.out.println("Premium Amount is>>" + lifeInsurance.getPremiumAmount());
	}
	
}
