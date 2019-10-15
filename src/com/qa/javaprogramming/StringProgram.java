package com.qa.javaprogramming;

public class StringProgram {

	public static int missing(int a[],int n)
	{

		
		int sum = (n+1)*(n+2)/2;
		for(int i=0;i<n;i++)
		
		sum=sum-a[i];
		
		
		return sum;
		
	}
	public static void main(String[] args) {
		int[] a = {1,2,4,5};
		int num = missing(a,4);
		System.out.println(num);
		
	}

}
