package com.encapsulation;

public class ACRMain {
      public static void main(String[] args) {
    	  //object
    	  Circle c1 = new Circle(4);
    	  System.out.println("Area of Circle:" + c1.calculateArea());
    	  Rectangle r1 = new Rectangle(2, 4);
    	  System.out.println("Area of Rectangle:" + r1.calculateArea());
          }
}