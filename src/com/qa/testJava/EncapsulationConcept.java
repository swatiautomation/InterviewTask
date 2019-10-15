package com.qa.testJava;

public class EncapsulationConcept {

	public static void main(String[] args) {
Student st= new Student();
st.setAge(11);
st.setID(1);
st.setName("swati");

st.getAge();
st.getID();
st.getName();

System.out.println("Values of id methods :"  + st.getID());
System.out.println("Values of age methods :" + st.getAge());
System.out.println("Values of name methods :" +  st.getName());

	}

}
