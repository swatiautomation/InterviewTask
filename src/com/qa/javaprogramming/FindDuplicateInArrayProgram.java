package com.qa.javaprogramming;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


public class FindDuplicateInArrayProgram {
	
	
	
	public static void main(String[] args) {
		
		////////////////By using Hash Map///////////////////////
		
			int[] arr1 ={1, 2, 8, 3, 2, 2, 2, 5, 1};
			int suma=0;
		
	 HashMap<Integer, Integer> map =new HashMap<Integer,Integer>();
	 
	 for(int no : arr1)
	 {
		 if(map.containsKey(no))
		 {
			 map.put(no, map.get(no) + 1);
		 }
		 else
		 {
			 map.put(no,1);
		 }
	 }
	
	 for(Map.Entry<Integer,Integer> entry : map.entrySet())
{
		 if(entry.getValue()>1)
		 {
	 System.out.println("Duplicate elements are " + entry.getKey() + " " + entry.getValue()); 
	 suma= suma + entry.getKey();
	 
		 }
	
}
	 System.out.println("sum of duplicate values are :" + suma);
	 
	//////////Second Method : By using Set ///////////////////////
	 HashSet<Integer> set=new HashSet<Integer>();
	 int[] arr ={1, 2, 8, 3, 3, 2,  5, 1};
	 int sum=0;
	 		
for(int i : arr)
{
	if(!set.add(i))
	{
		System.out.println("duplicate value :" + i);
		sum=sum+i;
	}
	

}
System.out.println("sum of all the duplicate element are : " + sum);

////////////find duplicate element :Brute Force Method ///////////////
int sumo=0;
for(int i=0;i<arr.length-1;i++)
{
	for (int j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j])
		{
			System.out.println("Duplicate element are :"+arr[j]);
			sumo = sumo + arr[j];
		}
	}
	

}
System.out.println("sum of all the duplicate element are : " + sumo);


	}

}
