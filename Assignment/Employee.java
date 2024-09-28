package com.assignment;
public class Employee extends User {
    double salary;
    
    public Employee(int id, String name, double salary) {
        super(id, name);  
        this.salary = salary;
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public void displayEmployeeDetails() {
        displayUserDetails();  
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }
}