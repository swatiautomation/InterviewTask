package com.java.starpattern;

public class StarPattern1 {
 	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println("");
		}
		for(int i =4;i>=1;i--)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(k);
			
			}
			System.out.println("");
		}

	}

}