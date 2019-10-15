package com.qa.javaprogramming;

import java.util.Arrays;
import java.util.HashMap;

public class StringAnargamCheckProgram {
	////////////////By using Arrays class (first sort then equals method)//////////////
public static boolean checkanagam(String st1,String st2)
{
	
	
	char[] ch1 = st1.replaceAll("[\\s]", "").toLowerCase().toCharArray();
	char[] ch2 = st2.replaceAll("[\\s]", "").toLowerCase().toCharArray();
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	return(Arrays.equals(ch1, ch2));

}
	
////// by using hashmap (key ,value )pair ///////////////////////////////////////////
	public static boolean checkanagram(String st1,String st2)
	{
		char[] ch1 = st1.replace("[\\s]", "").toLowerCase().toCharArray();
		char[] ch2 = st1.replace("[\\s]", "").toLowerCase().toCharArray();
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(char ch : ch1)
		{
			int n=1;
			if (hm.containsKey(ch)) 
				n++;
			
			hm.put(ch, n);	
			
		}
		System.out.println(hm);
		
		for(char ch :ch2) {
			int n=1;
			if(hm.containsKey(ch))
			n--;
				hm.put(ch, n);
			
		}
		System.out.println(hm);
		
		for(char ch : hm.keySet())
		{
			if(hm.get(ch)!=0)
			
			return false;
			
		}
		return true;
	}
	public static void main(String[] args) {
		
		System.out.println("checking for anagram returned : "+ checkanagram("Dave Barry","Ray Adverb"));
		System.out.println("checking for anagram returned : "+ checkanagam("Dave Barry","Ray Adverb"));
	}

}
