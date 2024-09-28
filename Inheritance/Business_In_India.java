package com.inheritance;

public class Business_In_India {
    String name;
    
    // Constructor for Business_In_India
    public Business_In_India(String name) {
        this.name = name;  
    }

    // Method to display business details
    public void disp_name() {
        System.out.println("Business Name: " + name);
    }
}