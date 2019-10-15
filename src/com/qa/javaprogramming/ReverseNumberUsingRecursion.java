package com.qa.javaprogramming;

public class ReverseNumberUsingRecursion {
	
	public static void recersionumber(int n)
	{
		if(n<10)
		{
			System.out.println(n);
		}
		else
		{
			System.out.print(n%10);
			recersionumber(n/10);
		}
	}

	public static void main(String[] args) {
		int n = 561;
		recersionumber(n);

	}

}
