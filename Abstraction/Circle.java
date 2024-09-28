package com.abstraction;

public class Circle extends Shape{

	@Override
	void area() {
		System.out.println(" Area..");	
		}
	public static void main(String[] args) {
		//object
		Shape s1=new Circle();
		s1.area();
		s1.info();
	}

}
