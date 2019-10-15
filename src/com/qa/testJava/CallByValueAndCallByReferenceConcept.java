package com.qa.testJava;

public class CallByValueAndCallByReferenceConcept {

int a=10;
int b=20;

public void sum(int a,int b)
{
this.a=a;
this.b=b;
System.out.println("example of call by value: "+a + "and" + b);
}
public void add(CallByValueAndCallByReferenceConcept t)
{

int y = t.a+t.b;
System.out.println(y);
System.out.println("exmple of call by reference is : " +t.a + "and" +t.b);
}


	public static void main(String[] args) {
		CallByValueAndCallByReferenceConcept obj= new CallByValueAndCallByReferenceConcept();
		obj.sum(10,40);
		
		obj.add(obj);

	}

}
