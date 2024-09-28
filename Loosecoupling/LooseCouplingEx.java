package com.loosecoupling;

public class LooseCouplingEx {

	public static void main(String[] args) {
		Car1 c=new Car1(new DiselEngine());
		c.move();

	}

}
