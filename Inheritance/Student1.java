package com.inheritance;

public class Student1 extends Personn{
	String rollNumber;
    String department;

    public Student1(String name,String ID, String city, String rollNumber, String department) {
        super(name,ID,city); 
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public void displayStudent1() {
        displayPersonn();
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Department: " + department);
    }
}
