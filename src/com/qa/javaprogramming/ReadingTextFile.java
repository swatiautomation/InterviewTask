package com.qa.javaprogramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingTextFile {
	static	int count=0;
	static int counter=0;
	public static void main(String[] args) throws FileNotFoundException {
		
			ArrayList<String> arrayone=new ArrayList<String>();
			ArrayList<String> arraytwo=new ArrayList<String>();
		 
		 
		File f = new File("C:\\Users\\hp\\eclipse-workspace\\Excersise_Java\\Test01.log");
		Scanner s = new Scanner(f);
		
		while(s.hasNext())
		{
			s.useDelimiter("\n");
			String line = s.next();
			if (line.contains("frmMain::CurrentDeltas – entered"))
			{
				String arr = line;
				System.out.print("Rows containing CurrentDeltas Entered : " +arr);
				
				String[] details = arr.split("\\s+");
				
				String second = details[1];
			
				
				arrayone.add(second);
			}
			
			else if (line.contains("frmMain::CurrentDeltas – exited"))
			{
				String arr1 = line;
				System.out.println("Rows containing CurrentDeltas Exited : " + arr1);
				
				String[] details1 = arr1.split("\\s+");
				
				String second1 = details1[1];
			
				
				arraytwo.add(second1);
			}
			
		}
		for(String i:arrayone)
		{
			System.out.println("value of TimeStamp of entered rows : " + i);
			count++;
			
		}
		System.out.println("value of rows found" +count);
		
		for(String j:arraytwo)
		{
			System.out.println("Value of TimeStamp of exited rows : " + j);
			 counter++;
		}
		System.out.println("value of rows found" +counter);
	
	}

}
