package com.qa.javaprogramming;

public class SmallAndLargeNumberInArrayProgram {

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,5,6,3,9,8};
		int small = arr[0];
		int big = arr[0];
		
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
		
		System.out.println("big number :" + big);
		System.out.println("big number :" + small);

	}

}
