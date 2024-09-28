package com.project;

public class Pen{
//data member
		String color;
		String type;
		//default constructor
		Pen(){
			System.out.println(" I am default constructor....");
		}
		//parametrised constructor
		Pen(int price) {
			System.out.println("parametrised constructor..");
		}
		public void write() {
			System.out.println("writing something...");


	}

}
