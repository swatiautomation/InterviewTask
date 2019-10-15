package com.qa.javaprogramming;

public class FabonicciaSeriesProgram {
	
	////////Factorial of a number using for loop///////////

	static int a =0;
	static int b=1;
	static int c=0;
	
	/*public static void fabo() {
		System.out.print(a +" " +b);
	
					for(int i=2;i<5;i++)
					{
						c=a+b;
						
						b=c;
						a=b;
						System.out.print(" " +c);
					}
						}*/
	
	//-----------factorial of a number using recursion method----------///////////
	
	public static void fabonicrecrusive(int number)
	{
		if(number>0) {
			
			c=a+b;
			a=b;
			b=c;
			
			System.out.print(" " +c );
			fabonicrecrusive(number-1);
		}
	}

	public static void main(String[] args) {
		//fabo();
		System.out.print(a + " " +b);
		fabonicrecrusive(5);
		

	}

}
