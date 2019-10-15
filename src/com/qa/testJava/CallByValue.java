package com.qa.testJava;

public class CallByValue {

	static int  a=10;
	
	public void meth(int a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) {
		CallByValue c = new CallByValue();
		System.out.println("value before calling :" +a);
		c.meth(20);
		System.out.println("value after calling :" +a);

	}

}
