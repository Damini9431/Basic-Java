package com.inheritance;

public class Activa {
String name;
double price;
    Activa(){
	System.out.println("I have petrol engine");
}
//method
    public void bill(String name,double price) {
	System.out.println("My new vechical:"+name+price);
	}
}
