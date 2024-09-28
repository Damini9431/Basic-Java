package com.abstraction;

public abstract class Shape {
//constructor
	public Shape() {
		System.out.println("constructor of shape class");
	}
	public void info() {
		System.out.println("non abstract method");
		}
	abstract void area();
}
