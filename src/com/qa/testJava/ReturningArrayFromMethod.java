package com.qa.testJava;

public class ReturningArrayFromMethod {

	public static void main(String[] args) {
		
String[] amake = ReturnArry();


for (int i = 0 ;i<amake.length;i++)
{
	System.out.println("total values of array is " + i + "value of each position is " + amake[i]);
}

	}
	
	public static String[] ReturnArry()
	{
		String[] sarr = new String[5];
		sarr[0]="car1";
		sarr[1]="car2";
		sarr[2]="car3";
		sarr[3]="car4";
		sarr[4]="car5";
		return sarr;
		
	}

}
