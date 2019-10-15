package com.qa.javaprogramming;

public class PerfectNumberProgram {

	public static void main(String[] args) {
		//int n;
	boolean b=	perfectn(12);
	if(b)
	{
		System.out.println("its a perfect number");
	}
	else
	{
		System.out.println("not a  perfect number");	
	}
	}
		public static boolean perfectn(int n)
		{
			int sum=0;
			int temp;
			
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				sum = sum +i;
				
			}
			if(sum==n)
			{
				return true;
			}
			
			
		}
		return false;

	}
}


