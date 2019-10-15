package com.java.starpattern;

public class NumberFormat1 {

	public static void main(String[] args) {
		for(int a=1,b=4,c=7;a<=3;a++,b++,c++)
		{
			System.out.println(a+ " " + b + " " + c);
		}

	
	
	int[] a={1,2,3,3,4,6,5,6};
	int index =0;
	for (int i=0;i<a.length;i++)
	{
		if(a[i]==3)
		{
			index=i;
			
			System.out.println(index);
		}
	}
}
}
