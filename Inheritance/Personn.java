package com.inheritance;

public class Personn {
	String name;
    String ID;
    String city;

    public Personn(String name, String ID, String city) {
        this.name = name;
        this.ID = ID;
        this.city = city;
    }

    public void displayPersonn() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("City: " + city);
    }
}
