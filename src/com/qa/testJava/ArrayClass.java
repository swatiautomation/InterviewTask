package com.qa.testJava;

import java.util.ArrayList;

public class ArrayClass {
public static void  main(int i)
	{
		System.out.println("overload main method");
		return;
	}

	public static void main(String[] args) {
		
		main(4);
		
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(300);
		ar.add(200);
		ar.add(500);
		
		for(Object i:ar)
		{
		System.out.println(i);	
		}
		String[] sarr = new String[] {"car1","car2","car3","car4","car5"};
		for (int i=0;i<sarr.length;i++)
		{
			System.out.println("Value at position " + i + " is :  " + sarr[i]);
		}
		
		//sarr.length;
		
		int[] arr = new int[5];
		
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		arr[4]=5;
		
		int index=0;
		while(index<5)
		{
			System.out.println("value of each index : " + arr[index]);
			index++;
		}
		
		
		int[] arr2= {1,2};
		int index1=0;
		while(index1<2)
		{
			System.out.println("value of new index1 is:" + arr2[index1]);
			index1++;
		}

	}

}
