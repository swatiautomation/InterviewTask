package com.qa.testJava;

public class CallbyRef {
	
	 int a;
	
	public void meth(CallbyRef c)
	{
		System.out.println(c.a);
		System.out.println("Value of c.a before incrementing x is "+c.a);
	      c.a=c.a+1;
	      System.out.println("Value of c.a after incrementing a is "+c.a);
	}

	public static void main(String[] args) {
		CallbyRef c = new CallbyRef();
		c.a=30;
		
//c.meth(c);

System.out.println("value before calling :" + c.a);

c.meth(c);

System.out.println("value after calling :" +c.a);


	}

}
