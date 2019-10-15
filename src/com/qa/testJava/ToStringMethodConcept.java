package com.qa.testJava;

public class ToStringMethodConcept {

	int rollno;
	String name;
	
	public ToStringMethodConcept(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	
	@Override
	public String toString()
	{
		return "{" + "rollno=" + rollno + "name=" +name+ '}';
	}
	
	public static void main(String[] args) {
		ToStringMethodConcept s = new ToStringMethodConcept(11,"ram");
		System.out.println(s);
		
		

	}

}
