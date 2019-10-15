package com.qa.javaprogramming;

public class PrimeNumberProgram {
public static void main(String[] args)
{
	
	
	//to check whether given number is even or odd//////////
int r=12;
{
	
	if(r%2 ==0)
	{
	System.out.println("this is even number");

	}
	else
	{
		System.out.println("this is odd number");
	}
}

	
	///to print all the even /odd number between 1 to 10 //////////////
for(int i=2;i<=10;i+=2)
{
	System.out.println("Even Number:" + i);
}
for(int i=1;i<=10;i+=2)
{
	System.out.println("Odd Number:" + i);
}


boolean isprime = true;
int num=17;
for(int i=2;i<=num/2;i++)
{
	if(num%i==0)
	{
		isprime=false;
		break;
	}
}
	if(isprime)
	{
				System.out.println("given number is prime");
	}
	else
	{
		System.out.println("given number is not prime");
	}
	

////////////////to print prime number between 1 to 100/////////
for(int i=1;i<10;i++)
{
	boolean isprimenumber = true;
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			isprimenumber=false;
			break;
		}
	}
	
	if(isprimenumber)
	{
		System.out.println("Prime number between 1 to 10 is:" +i);
	}
}

}
}
