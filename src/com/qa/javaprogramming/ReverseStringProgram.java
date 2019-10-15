package com.qa.javaprogramming;

public class ReverseStringProgram {
	
	public static String reverstr(String s)
	{
		if(s==null || s.isEmpty())
		{
		return s;
	}
	
		String reverse="";
	for(int i=s.length()-1;i>=0;i--)
	{
		reverse = reverse+s.charAt(i);
		
	}
return reverse;
}

	/////////// to reverse a string using recursive method ////////////////////////////////////////////////////
	public static String recursivemethod(String s)
	{
		if(s==null || s.length()<=1) {
			return s;
		}
		return recursivemethod( s.substring(1))+s.charAt(0);
		
	}
	
	public static int stringlenght(String s)
	{
		String sn=s.replace("\\s", "");
		if(s.equals(""))
			return 0;
		else
			
			return stringlenght(sn.substring(1)) + 1;
	}
	public static void main(String[] args) 
	{
	//System.out.println(reverstr("hello there"));
	//System.out.println(recursivemethod("swati sharma"));
	
		System.out.println(stringlenght("swati sharma"));
	///////////////This approach also reverse a string: swati became "itawa"//////////////////////////////////
	String name = "nitin";
	char[] ch=name.toCharArray();
	String rev ="";
	int count=0;
		for (int i=ch.length-1;i>=0;i--)
		{
			  count++;
			rev = rev+ch[i];
		}
		System.out.println(rev + " " + count);
	}
	
}