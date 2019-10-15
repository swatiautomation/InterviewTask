package com.qa.javaprogramming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class TestProgramone {
	
	

	public static void main(String[] args) throws FileNotFoundException {
	/*	String s = "10";
	int i=	Integer.parseInt(s);
	System.out.println(i);
	
	Integer I=Integer.valueOf(s);
	System.out.println(I);
int x;*/
/*int num =1;
for(int i=1;i<=5;i++)
{
	for(int j=1;j<=i;j++)
	{
		System.out.print(num+" ");
		num++;
		
	}
	System.out.println("");
	
}*/
		
		FileReader f = new FileReader("C:\\Users\\hp\\eclipse-workspace\\Excersise_Java\\Test01.log");
		BufferedReader br = new BufferedReader(f);
		StringBuffer str = new StringBuffer();
		try 
		{
		while(br.readLine()!=null)
			str.append(br.readLine());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(str);

}
	
}
