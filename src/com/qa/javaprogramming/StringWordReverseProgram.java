package com.qa.javaprogramming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringWordReverseProgram {
	
//This approach to reverse a word in reverse character : swati sharma became  "sharma swati"
	public static void main(String[] args) {
		String s= "Swati sharma";
		String[] st=s.split(" ");
		String result="";
		int count=0;
		
for(int i=st.length-1;i>=0;i--)
{
	count++;
	result = result + (st[i]+" ");
}
System.out.println("total number of words in given string is :" + count + "" );
System.out.println(" output string is :" + result.trim());
	
	
	//This approac reverse a word in a strig : swati sharma became "sharma swati"
	
	/*public static String reverseWords (String s) 
	{
	    String str = " ";
	    List<String> words = Arrays.asList(s.split(str));
	    Collections.reverse(words);
	    return String.join(str, words);
	}*/

	/*public static void main(String[] args) 
	{
	    System.out.println(reverseWords("Swati Sharma"));
	} */
	
	String s1 = "swati sharma";
	char c ='t';
	int count1 = s1.length()- s1.replace("c" ,"").length();
	
	
System.out.println(count1);
	}
}

