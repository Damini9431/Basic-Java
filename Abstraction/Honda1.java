package com.abstraction;

public class Honda1 implements Bike1,Car {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside run method");
	}

	@Override
	public void avg() {
		// TODO Auto-generated method stub
		System.out.println("inside avg");
	}

	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("inside engine");
	}

	@Override
	public void avg1() {
		// TODO Auto-generated method stub
		System.out.println("from car interface");
	}
public static void main(String[] args) {
	//object
	Bike1 b1=new Honda1();
	b1.run();
	b1.avg();
	b1.engine();
	Car c1=new Honda1();
	c1.avg1();
}
}
