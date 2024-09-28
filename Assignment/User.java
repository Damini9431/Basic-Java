package com.assignment;
public class User {
	int id;
    String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayUserDetails() {
        System.out.println("User ID: " + id);
        System.out.println("User Name: " + name);
    }
}
