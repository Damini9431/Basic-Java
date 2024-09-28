package com.inheritance;

public class Employee1 extends Personn{
	double salary;

    public Employee1(String name,String ID, String city, double salary) {
        super(name,ID,city);
        this.salary = salary;
    }

    public void displayEmployee1() {
        displayPersonn();
        System.out.println("Salary: " + salary);
    }
}
