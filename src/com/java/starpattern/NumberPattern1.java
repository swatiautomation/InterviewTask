package com.java.starpattern;

public class NumberPattern1 {

	public static void main(String[] args) {
		int num=0;
	for(int i=1;i<=5;i++)
	{
		if(i%2!=0)
		{
			for(int j=1;j<=3;j++)
			{
				num++;
				System.out.print(num);
				
				
			}
		}
			
			else
			{
				int temp=num+1;
				for(int j=num+3;j>=temp;j--)
				{
					num++;
					System.out.print(j);
					
				}
			}
		System.out.println("");
		}
		
		
	}

	}


