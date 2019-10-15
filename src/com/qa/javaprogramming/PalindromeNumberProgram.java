package com.qa.javaprogramming;

public class PalindromeNumberProgram {

	public static void main(String[] args) {
	
int num=126;
int r=0;
int sum=0;
int temp;

temp=num;

while(num>0)
{
	r=num%10;
	sum =  (sum *10)+r;
	num = num/10;
	
	
}
if (sum==temp) {
	System.out.println("this is palindrom number");
System.out.println(sum);

	
	}
else
{
	System.out.println("this is reverse of the number : " + sum);
}
	}
}
