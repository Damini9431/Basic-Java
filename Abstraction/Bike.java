package com.abstraction;

public abstract class Bike {
	
Bike(){
	System.out.println("I am in bike constructor");
}
//abstract non-abstract
public void msg() {
	System.out.println("non abstract method");
	}
abstract void run();
}