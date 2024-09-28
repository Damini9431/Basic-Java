package com.encapsulation;

public class Circle extends Area {
private double radius;
    //constructor
    public Circle(double radius) {
	this.radius = radius;
}
   //method
    public double calculateArea() {
	return getPi() * radius * radius;
    }
}
