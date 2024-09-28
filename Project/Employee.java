package com.project;

public class Employee {
	
	    public void print_info(String name, int id) {
	    	System.out.println("Name of Employee:"+name);
	    	System.out.println("ID of Employee:"+id);
	    }
	    public void print_info(int sal, int id) {
	    	System.out.println("Salary of Employee:"+sal);
	    	System.out.println("ID of Employee:"+id);
	    }
	    public void print_info(String name, String desg) {
	    	System.out.println("Name of Employee:"+name);
	    	System.out.println("Designation of Employee:"+desg);
	    }
	    
	    public static void main(String[] args) {
	    	Employee e1=new Employee();
	    	e1.print_info("Damini",210);
	    	e1.print_info(55000,210);
	    	e1.print_info("Damini","Software Engineer");
	    }
	    
	}
