package com.Polymorphism;

public class Stud {

	public void print_info(String name) {
		System.out.println("Name of student:"+name);
	}
	
	public void print_info(int age) {
		System.out.println("Age of student:"+age);
	}
	
	public void print_info(String name,int age) {
		System.out.println("Basic info of student:"+name+age);
	}
	
	public static void main(String[] args) {
		//object create
		Stud s1=new Stud();
		//call 
		s1.print_info("Damini");
		s1.print_info(10);
		s1.print_info("Damini", 20);
	}
}