package com.inheritance;
import java.util.Scanner;
public class PESMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

        System.out.println("Enter Employee details:");
        System.out.print("Name: ");
        String empName = sc.nextLine();
        System.out.print("ID: ");
        String empID = sc.nextLine();
        System.out.print("City: ");
        String empCity = sc.nextLine();
        System.out.print("Salary: ");
        double empSalary = sc.nextDouble();
        sc.nextLine();  

        Employee1 emp = new Employee1(empName, empID, empCity, empSalary);
        System.out.println("\nEmployee Details:");
        emp.displayEmployee1();

   
        System.out.println("\nEnter Student details:");
        System.out.print("Name: ");
        String stuName = sc.nextLine();
        System.out.print("ID: ");
        String ID = sc.nextLine();
        System.out.print("city: ");
        String city = sc.nextLine();
        System.out.print("Roll Number: ");
        String rollNumber = sc.nextLine();
        System.out.print("Department: ");
        String department = sc.nextLine();

        Student1 stud = new Student1(stuName ,ID , city, rollNumber, department);
        System.out.println("\nStudent Details:");
        stud.displayStudent1();

        sc.close();
    }

	}
