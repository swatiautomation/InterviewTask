package com.java.starpattern;

public class StarPattern3 {
static char ch = 'A';
	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(ch);
			}
			ch++;
			System.out.println("");
		}
		

	}

}
