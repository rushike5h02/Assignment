package com.Assignment12_2;

import java.util.Scanner;

//	HDFCBank
//	double:
//	getCalculateInterest(double
//	principleAmount, int tenure,
//	float rateOfInterest)
//	void: getHDFCBankDetails()

public class HDFCBank extends Bank {
	public void getHDFCDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the details for HDFC bank>>");
		System.out.println("Principal Amount>>");
		principleAmount = scanner.nextDouble();
		System.out.println("Tenure>>");
		tenure = scanner.nextInt();
		System.out.println("Rate of Interest>>");
		rateOfInterest = scanner.nextFloat();
		System.out.println(
		"Simple interest for HDFC bank>>" + getCalculateInterest(principleAmount, tenure, rateOfInterest));
		}
		private double getCalculateInterest(double principleAmount, int tenure, float rateOfInterest) {
		return ((principleAmount * tenure * rateOfInterest) / 100);
		}

}
