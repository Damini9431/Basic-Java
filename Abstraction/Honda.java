package com.abstraction;

public class Honda extends Bike {

	@Override
	void run() {
	System.out.println("bike is running..");	
	}
public static void main(String[] args) {
	//object
	Bike b1=new Honda();
	b1.run();
	b1.msg();
}
}
