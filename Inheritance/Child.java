package com.inheritance;

public class Child extends Parent{


	 String city;



	public Child(String name,String id,String city) {
		//parent constructor
		super(name, id);
		this.city=city;
	}

	
	
	public void printInfo() {
		System.out.println(name+" "+id+" "+city);
		/*System.out.println(super.id);
		System.out.println("parent class variable:"+super.name);
		super.parent_method();*/
	}
	
}
