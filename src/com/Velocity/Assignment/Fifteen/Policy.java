package com.Velocity.Assignment.Fifteen;

import java.util.Scanner;

//1.1   Design the Policy class that contain policy id, policy name, policy type, premium amount etc. 
//1.2   Design the below method into Policy class and which return the policy object
//		public Policy getPolicyDetails() 
//1.3   Input should be taken from user and print that data into getPolicyDetails () method.




public class Policy {
	
	String policyName;
	int policyId;
	String policyType;
	int premiumAmount;
	
	public Policy getPolicyDetails() {
		
		Policy policy = new Policy();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Policy Name=");
		policyName = sc.nextLine();
		
		System.out.println("Enter The Policy Type=");
		policyType = sc.nextLine();
		
		System.out.println("Enter The Policy ID=");
		policyId = sc.nextInt();
		
		System.out.println("Enter The Premium Amount=");
		premiumAmount = sc.nextInt();
		
		getPolicyDetails(policyName, policyId, policyType, premiumAmount);
		
		
		return policy;
			
	}

	private void getPolicyDetails(String policyName, int policyId, String policyType, int premiumAmount) {
		
		System.out.println("The Policy Name=" + policyName);
		System.out.println("The Policy ID=" + policyId);
		System.out.println("The Policy Type=" + policyType);
		System.out.println("The Policy Premium Amount=" + premiumAmount);
	}


	public static void main(String[] args) {
		
		Policy p = new Policy();
		
		p.getPolicyDetails();
		
		

	}

}
