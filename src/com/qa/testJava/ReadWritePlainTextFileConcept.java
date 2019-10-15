package com.qa.testJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReadWritePlainTextFileConcept {

	public static void main(String[] args) throws IOException {
	
		StringBuilder sb= new StringBuilder();
		String File = "C:\\Users\\hp\\ReadWrite.txt";
		
		FileWriter fw=new FileWriter(File,true);
		
fw.write("Hello testing121212");
fw.close();

//BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hp\\ReadWrite.txt"));

File f = new File("C:\\Users\\hp\\ReadWrite.txt");
Scanner sc = new Scanner(f);
while(sc.hasNext())
{
	String we = sc.nextLine();
	
	System.out.println(we);
}

//String t = br.readLine();

//System.out.println(t);
	}

}
