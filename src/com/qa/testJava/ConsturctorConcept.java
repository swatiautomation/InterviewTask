package com.qa.testJava;

import java.util.Scanner;

public class ConsturctorConcept {

	long accountnumber;
	String AcName;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter total number of account");
		int totalacct=scan.nextInt();
		ConsturctorConcept[] ar = new ConsturctorConcept[totalacct];
		
		for (int i=1;i<=ar.length;i++)
		{
			System.out.println("enter "+i+" customer of account");
			ConsturctorConcept ar1 = new ConsturctorConcept();
			System.out.println("enter account number");
			ar1.accountnumber=scan.nextLong();
			System.out.println("enter account name");
			ar1.AcName=scan.next();
			ar[i]=ar1;
		}
		
		
	for(int i=1;i<=ar.length;i++)
	{
		ConsturctorConcept ar1 = ar[i];
		System.out.println("customer "+i+" details are:");
		System.out.println("account nummber are : " +ar1.accountnumber );
		System.out.println("account name are : " +ar1.AcName );
		
		
	}
	
	
	

	}

}
