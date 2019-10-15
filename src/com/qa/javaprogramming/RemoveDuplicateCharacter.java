package com.qa.javaprogramming;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacter {

	public static String removeDuplicate(String str) {
	String s = "heelloo";
	char[] c = s.toCharArray();

	Set<Character> set=new LinkedHashSet<Character>();
	for(char ch : c)
	{
		set.add(ch);
	}
	StringBuffer sb= new StringBuffer();
	for(char ch1:set)
	{
		sb.append(ch1);
		
	}
	return sb.toString();
	}

	public static void main(String[] args) {
	
		
	System.out.println(	removeDuplicate("hellolo"));
		
	}

}
