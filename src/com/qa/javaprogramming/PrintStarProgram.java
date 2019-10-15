package com.qa.javaprogramming;

public class PrintStarProgram {

	public static void main(String[] args) {

//in a row and coulm equal star displayed
		/*for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{
				System.out.print("*");
				
			}
			System.out.println("*");
		}*/
		
		//pyramid pattern
		/*for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
				
			}
			System.out.println();
		}

	}*/
		
		//printing 180 star pattern
/*int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=2*(n-i);j>=0;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			}
		}*/
		
		
		//triangle pattern
		/*int n =5;
		for (int i=0;i<n;i++)
		{
			for(int j=n-i;j>1;j--)
			{
				System.out.print(" ");
			}
				for(int j=0;j<=i;j++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
			
		}*/
		
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1 || i==4|| j==1 || j==4)
				{
					System.out.print(" * ");
				}
				else 
				{
				System.out.print(" ");
				}
					
		}
			System.out.println();
}*/
		
		/*for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		for(int i=3;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/

	


	
	/*for(int i=1;i<=7;i++)
	{
		for(int j=7;j>=i;j--)
		{
			System.out.print(j);
		}
		System.out.println();
	}*/
		
		/*for(int i=7;i>=1;i--)
		{
			for(int j=7;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		/*for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				int k=i+j-1;
				if(k>4)
				{
					System.out.print(k-4);
				}
				else {
				System.out.print(k);
				
			}
		}
			System.out.println();
	}*/
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("1");
				}
				else
					
					{
					System.out.print("0");
					
					}
			}
			System.out.println(" ");
		}
}
}
