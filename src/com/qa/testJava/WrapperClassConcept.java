package com.qa.testJava;

public class WrapperClassConcept {

	public static void main(String[] args) {
		
		//NumberFormatException if string is not pure interger and you try to convert to integer.
		
		//interger to string = user parseInt method
		String y = "100";
		int a=Integer.parseInt(y);
		System.out.println(a+10);
		
		
		//String to interger = use valueOf method
		int q=20;
		String val = String.valueOf(q);
		System.out.println(val+10);
		
		
		//NumberFormatException
		String z= "this is 100";
		int e=Integer.parseInt(z);
		System.out.println(e);

	}

}
