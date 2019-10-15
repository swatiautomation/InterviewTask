package com.java.starpattern;

public class Testclass {

	public static void main(String[] args) {
		String s =" java  is good";

		System.out.println(s.split("\\s+").length);
		
		String s2="";
for(int i=s.length()-1;i>=0;i--)
{
	s2=s.charAt(i)+s2;
	if(s.charAt(i)==' ')
	{
		System.out.print(s2);
		s2="";
	}

}
	

}
}
