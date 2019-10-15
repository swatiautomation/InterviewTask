package com.qa.testJava;

public class SingletonClassConcept {

	private SingletonClassConcept()
	{
		str = "HELLO instance";
	}
	
	

public String str;
private	static SingletonClassConcept instance = null;

public static SingletonClassConcept getInstance()
{
	if(instance == null)
		 instance= new SingletonClassConcept();
	return instance;
}


public static void main(String[] args) {
		SingletonClassConcept s = SingletonClassConcept.getInstance();
		SingletonClassConcept s1 = SingletonClassConcept.getInstance();
		SingletonClassConcept s2 = SingletonClassConcept.getInstance();
	s.str=	(s.str).toUpperCase();
		//s1.str=	(s1.str).toLowerCase();
		System.out.println(s.str);

		System.out.println(s1.str);

	System.out.println(s2.str);
	
	
	
	
//System.out.println(s1.str);
	}

}
