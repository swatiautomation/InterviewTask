package com.qa.javaprogramming;

import java.util.Arrays;

public class BubbleSortProgram {

	public static void main(String[] args) {
	
		////////////////sorting the array using bubble sor////////////////////////
	int [] arr = {88,23,34,1,3,5};
	int temp=0;
	
	for(int i=0;i<=arr.length-1;i++)
	{
		for(int j=0;j<arr.length-1;j++)
		{
			if(arr[j]>arr[j+1])
			{
				temp=arr[j];
				arr[j]= arr[j+1];
				arr[j+1]=temp;
			
			}
		
		}
	}
	System.out.println("Sorted Array :");
	for(int i=0;i<arr.length;++i)
	{
		
		System.out.print(arr[i]);
		System.out.println();
	}
	
	
	//////////////largest and smallest number in array  //////////////////////////////
	int big=arr[0];
	int small=arr[0];
	
	
	for(int i=0;i<arr.length;i++)
	{
		
			if(arr[i]>big)
			{
				big=arr[i];
				
			}
			else if(arr[i]<small)
			{
				small = arr[i];
			}
	
	}
	System.out.println("largest number is :" + big);
	System.out.println("Smallest number is :" + small);
	
	
	///////////////find second largest number in array/////////////////////////
	int a[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
	int large=a[0];
	int second_large = a[0];
	
	for(int i=0;i<a.length;i++)
	{
		if(a[i]>large)
		{
			second_large = large;
			large=a[i];
			
		}
		else if (a[i]>second_large)
		{
			second_large=a[i];
		}
		
	}
	System.out.println("second largest number is: "+ second_large);
	
	///////////using arrays class ///////////////////
	Arrays.sort(a);
	System.out.println("second smallest number is :"+ a[1]);
	
	///////////////find second smallest number in array//////////////////
	
	int b[] = { 14, 46, 47, 86, 92, 52, 48, 36, 66, 85 };
			int smallest = Integer.MAX_VALUE;
			int second_small=Integer.MAX_VALUE;

	for(int i=0;i<b.length;i++)
	{
		if(b[i]<smallest)
		{
			second_small=smallest;
			smallest = b[i];
		}
		else if(b[i]<second_small && b[i]>smallest)
		{	
			second_small =b[i];
		}
	}
	System.out.println("second smallest number is: "+ second_small);
	
	}

}
