package com.inheritance;

public class International_Business extends Business_In_India {

    // Constructor for International_Business
    public International_Business(String name) {
        super(name);
    }

    // Method specific to international business details
    public void International_detail() {
        System.out.println(name + " is a international business...");
    }
    
}
