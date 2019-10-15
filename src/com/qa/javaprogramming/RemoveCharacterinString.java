package com.qa.javaprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RemoveCharacterinString {

	public static void main(String[] args) {
	String s1 = " swati sharma ";
	System.out.println(s1.trim());
	String s3=s1.replaceAll("wati", "");
	System.out.print(s1);
	
	
	int[] a = {5,6,1,2,8};
	int max=a[0];
	int min=a[0];
	
	
	for(int i=0;i<a.length;i++)
	{
		if (a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("mini number is:"+min);
	
	
	Integer[] ina= {5,6,1,2,8};
	int mino=Collections.min(Arrays.asList(ina));
	int maxo=Collections.max(Arrays.asList(ina));
	
	System.out.println("min and max number is:" + maxo + mino);
	ArrayList<Integer> al = new ArrayList<Integer>();
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(4);
	al.add(5);
	
	al.remove(2);
	
	Collections.reverse(al);
	
	System.out.print(al);
	
	String[] s  = new String[3];
	s[0]="This is Swati";
	s[1]="beautiful";
	s[2]="stupid";
	
	for(int i=0;i<s.length;i++)
	{
	System.out.println(s[i]);
	
//System.out.print(removechar(s,1));
	}
	
/*public static String removechar(String s,int pos)
{
	return(s.substring(0, pos)+ s.substring(pos+1));
}*/

}
}