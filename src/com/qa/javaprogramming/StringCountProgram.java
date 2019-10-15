package com.qa.javaprogramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class StringCountProgram {

	public static void main(String[] args) {
		/////////-------Program 1-----------//////////////
		/*String str = "hello ram";
		
		int size = str.length();
		System.out.println("Size of String:" +size);  //give size inlcuding space .
		
		int count =0;
		
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
				count++;
		}
		System.out.println("Toatal number of character in String :" +count);*/
////----------- Program 2-----------------------///////////		
		/*int count=0;
		String t = "Hello !! There !!";
		
		for(int i=0;i<t.length();i++)
		{
			if(t.charAt(i)=='!')
				count++;
		}
		System.out.println(count);*/
		
	/////------Program 3----------------///////////
		/*String str3="Hello This is Swati Sharma";
		
		int vcount=0;
		int ccount=0;
		
		for (int i=0;i<str3.length();i++)
		{
			if(str3.charAt(i)=='a' || str3.charAt(i)=='e' || str3.charAt(i)=='i' || str3.charAt(i)=='o' || str3.charAt(i)=='u' )
				vcount++;
		}
		System.out.println(vcount);
		
		for(int j=0;j<str3.length();j++)
		{
			if(str3.charAt(j)>='a' && str3.charAt(j)<='z')
				ccount++;
			
		}
		System.out.println(ccount);*/
		
		///////-----Program4--------------/////
		
		/*String str4="helol";
		String str5 ="lloeh";
		
		
		if(str4.length() != str5.length())
		{
			System.out.println("String are unequal length");
			
		}
		
		else
		{
			char[] c=str4.toCharArray();
			char[] cc=str5.toCharArray();
		
		Arrays.sort(c);
		Arrays.sort(cc);
		for(char u:c)
		{
			System.out.println(u);
		}
		
		for(char u1:cc)
		{
			System.out.println(u1);
		}
		
		if(Arrays.equals(c, cc)==true)
		{
			System.out.println("Both the strings are anagram");  
		}
		
		else
		{
			  System.out.println("Both the strings are not anagram"); 
		}
		
		}*/
	/////---------Program 5-------------//////////
		
		String str6="Hello java program";
		//str6=str6.replaceAll("\\s+", "");
		str6=str6.replaceAll("\\s+", "k");
		System.out.println(str6);
		
		/////----Program 6----------------------////////////////
/*//		String test="lemel";
//		boolean flag = true;
//		
//		for(int i=0;i<test.length()/2;i++)
//		{
//			if(test.charAt(i)!=test.charAt(test.length()-i-1))
//			{
//				flag = false;
//				break;
//			}
//		}
//			if(flag)
//			
//			System.out.print("String is palindrom");
//			else
//				System.out.println("String is not palindrom");
//				
 * 
//		
*/	
	/////////--------Program 7---------////////////////
	
	/*String s = "abcde";
	String d="deabc";
	
	if(s.length()!=d.length())
	{
		System.out.println("Second string is not a rotation of first string");   
	}
	else
	{
		s=s.concat(s);
		if(s.indexOf(d)!=-1)
			 System.out.println("Second string is a rotation of first string");    
        else    
            System.out.println("Second string is not a rotation of first string"); 
}
	*/
	////////////--------------Program 8=-----------------///////////
	
	/*String re="hello java";
	String reverse = "";
	
	for(int i=re.length()-1;i>=0;i--)
	{
		reverse= reverse+ re.charAt(i);
	}
	System.out.println(reverse);
	*/
	/*String pa ="kayak";
	boolean flag = true;
	
	
	
	for(int i=0;i<pa.length()/2;i++)
	{
		if(pa.charAt(i)!=pa.charAt(pa.length()-i-1))
		{
		flag = false;
		break;
		}
		
	}
	if(flag)
		System.out.println("string is palindrom");
	else
		System.out.println("string is not palindrom");*/

	
	HashMap<Character, Integer> map =new HashMap<Character,Integer>();
	String rever = "swatisharma";
	char[] chr = rever.toCharArray();
	for(char i : chr) {
		if(map.containsKey(i))
		{
			map.put(i, map.get(i)+1);
		}
		else
		{
			map.put(i, 1);
		}
	}
	
	for(Map.Entry<Character,Integer> val:map.entrySet())
	{
		
		
		System.out.println("conunt of character " + val.getKey() + " is : " + val.getValue()  );
	}
	//System.out.println(map);
	
	
}
}
