package com.qa.javaprogramming;

public class RemoveSpecialCharProgram {

	public static void main(String[] args) {
		
		String s="yo-dude: like, ... []{}this is a string";
		
		String result = s.replaceAll("[^0-9a-zA-Z]", "");
		System.out.println(result);

	}

}
