package com.qa.javaprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharInStringProgram {
 ////////////////find dupicate using hash map //////////////////////////////////
	public static  void RemoveDuplicateusingMap(String str)
	{

	Map<Character,Integer> map = new HashMap<Character,Integer>();
	char[] arr = str.toCharArray();
	
	for(char value :arr)
	{
		if(map.containsKey(value)) {
			map.put(value, map.get(value)+1);
			//map.remove(value);
		}
		else
		{
			map.put(value, 1);
			
		}
	}
	System.out.println(map);
	
	
	
	for(Map.Entry<Character, Integer> ch1:map.entrySet())
	{
		if(ch1.getKey()>1) {
			System.out.println(" "+ch1.getKey()+ " " +ch1.getValue() );
		}
		
	}
	
	
	}
	
	
	/////////////////////////find duplicate using set method///////////////////////////////
	public static void duplicateusingSet(String str1)
	{
	char[] arr =str1.toCharArray();
	Set<Character> set = new HashSet<Character>();
	for(char ch:arr)
	{
		if(!set.add(ch))
		{
			System.out.println("duplicate character is:" +ch);
		}
	}
	}

	public static void removeduplicatevalue(String s)
	{
		char[] arr =s.toCharArray();
		int len = s.length();
	
		for(int i=0;i<len;i++)
		{
		
		for (int j=i+1;j<len;j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				int temp = j;
				for(int k=temp;k<len-1;k++)
				{
					arr[k]=arr[k+1];
				}
				j--;
				len--;	
			}
				
				
			}
		}
		
		String withoutduplicate = new String(arr);
		System.out.println(withoutduplicate);
		
		}
	
	public int main(int a)
	
	{
		System.out.println("hello main method is overloaded");
		return a;
	}
	public static void main(String[] args) {
		
		RemoveDuplicateusingMap("hellhoo");
		duplicateusingSet("hellhoo");
		removeduplicatevalue("hellhoo");
		
	}

}
