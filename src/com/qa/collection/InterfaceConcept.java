package com.qa.collection;

public class InterfaceConcept implements TestInterface {

	@Override
	public  void fatherNameDisplayed() {
		System.out.println("Anil Kumar Shaarma");
		
	}
	
	public static void display(String... values)
	{
		//System.out.println("display method invoked");
		for(String n : values)
		{
			System.out.println(n);
		}
	}
	
	



public static void main(String[] args)
{
	InterfaceConcept ic = new InterfaceConcept();
	ic.fatherNameDisplayed();
	TestInterface.nameDisplay();
	display();
	display("ram");
	display("swati" ,"sharma");
	
}

}