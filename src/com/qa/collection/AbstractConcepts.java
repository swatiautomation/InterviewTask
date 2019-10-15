package com.qa.collection;

public class AbstractConcepts implements TestInterface,AbstractClass2 {
	
	

	public static void main(String[] args) {
		
		//AbstractConcepts ab = new AbstractConcepts();
		TestInterface tf= new AbstractConcepts();
		tf.fatherNameDisplayed();
		TestInterface.nameDisplay();
		
		AbstractClass2 ac = new AbstractConcepts();
		
		
		
		
		
		
		
		
	}

	

	



	@Override
	public void motherName() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void siterName() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void fatherNameDisplayed() {
		// TODO Auto-generated method stub
		
	}

}
