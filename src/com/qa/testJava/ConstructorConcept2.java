package com.qa.testJava;

public class ConstructorConcept2 {

	int accunumb ;
	String acctname ;
	
	ConstructorConcept2(int accunt,String name)
	{
		this.accunumb = accunt;
		this.acctname= name;
	}
	public String getAcctname() {
		return acctname;
	}
	public void setAcctname(String acctname) {
		this.acctname = acctname;
	}
	public static void main(String[] args) {
		ConstructorConcept2 obj= new ConstructorConcept2(123,"ram");
		
		System.out.println(obj.acctname);
		System.out.println(obj.accunumb);
		
		obj.setAcctname("tola");
		System.out.println(obj.getAcctname());
	}

}
