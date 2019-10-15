package com.qa.javaprogramming;

public class StringPalindromProgram {
	
	////////////////By using for loop ///////////////////////////

	public static void main(String[] args) {
		String s = "Nitin";
		String rev = "";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev = rev+ s.charAt(i);
			
		}
		System.out.println(rev);
if(rev.equalsIgnoreCase(s))
{
	System.out.println("string is palindrom");
	
}
else
{
	System.out.println("string is not palindrom");
}
	
	////////////// By using string buffer "reverse" function/////////////////////
	StringBuffer sb= new StringBuffer(s);
sb.reverse();
String news = sb.toString();
if(news.equalsIgnoreCase(s))
{
	System.out.println("string is palindrom");	
}
else
	
{
	System.out.println("string is not palindrom");
}



}
}
