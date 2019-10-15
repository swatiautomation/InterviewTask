package com.qa.collection;

import java.util.Arrays;
import java.util.Collections;

public class CompareConcept {

	public static void main(String[] args) {
int temp;
int[] a= new int[] {2,1,4,3,6,7,5,9,8};
//This is method present in collection .it implements Comparable interface to sort the arrays in acending order./////////////
Arrays.sort(a);
String[] fruits = {"Orange", "Grape", "Apple", "Lemon", "Banana"};
Arrays.sort(fruits, Collections.reverseOrder());
System.out.println(Arrays.toString(fruits));
//Or using for each method.///////////////////
for(int a1:a)
{
	System.out.println(a1);
}


//By using liner search approach we sort the arrays in acceding /descending order respectively.
for(int i=0;i<=a.length-1;i++)
{
	for(int j=i+1;j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	}
	System.out.println(a[i]);
	
}

	}

}
