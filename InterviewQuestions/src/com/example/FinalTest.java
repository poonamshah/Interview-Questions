package com.example;

public class FinalTest {
	
	private String name;
	 
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	public static void main(String [] args) {
		
		final FinalTest obj = new FinalTest();
		obj.setName("Poonam");
		
		FinalTest obj2 = new FinalTest();
		// The below operation is not allowed  
		//obj = obj2;
		
		
		System.out.println(obj.getName());
		
		
	}

}
