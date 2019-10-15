package com.qa.javaprogramming;

public class ArmstrongProgram {

	public static void main(String[] args) {
		int num=12;
		int r=0;
		int sum =0;
		int temp,count=0;
		
		temp = num;
		while(num>0)
		{
			r = num%10;
			sum =  sum + (r*r*r);
			count++;
			num = num/10;
			
		}
		System.out.println("numer of digit in given number is"+ " " +count);
		if (sum==temp)
		{
			System.out.println("is a armstrong number");
	    }
		else
		{
			System.out.println("not a armstrong number");
		}

}
}