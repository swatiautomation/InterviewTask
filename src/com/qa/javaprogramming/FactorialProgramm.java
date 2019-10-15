package com.qa.javaprogramming;

public class FactorialProgramm {
	
	static int num=5;
	static int fact=1;
	static int k;
	
	public static void fact()
	{
		for(int i=1;i<=num;i++)
		{
			
			fact=fact*i;
			
		}
		System.out.println("Factorail of " + num + "  is : "+ fact);
		
	}
	
	//------------recursion method--------/////////////////
	public static int factorecursive(int number)
	
	{
		if(number==0)
			return 1;
		
		else
			return(number*factorecursive(number-1));
	}

	public static void main(String[] args) 
	{
		
		fact();
		
		System.out.println(factorecursive(5));
			
	}

}
