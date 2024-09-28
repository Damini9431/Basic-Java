package com.encapsulation;

public class Rectangle extends Area {
private double length;
private double width;
    //constructor
    public Rectangle(double length, double width) {
	this.length = length;
	this.width = width;
    }
    //method
    public double calculateArea() {
	return length * width;
    }
}
