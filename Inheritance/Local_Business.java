package com.inheritance;

public class Local_Business extends Business_In_India {

    // Constructor for Local_Business
    public Local_Business(String name) {
        super(name);
    }

    // Method specific local business details
    public void Local_detail() {
        System.out.println(name + " is a local business...");
    }
}

