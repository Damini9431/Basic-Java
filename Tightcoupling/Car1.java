package com.Tightcoupling;

public class Car1 {
	PetrolEngine e;
	Car1(){
		e=new PetrolEngine();
	}
public void move() {
	System.out.println("Car moves with:");
	e.show();
}
}
