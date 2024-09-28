package com.ComparableAndComparator;
public class Employee implements Comparable<Employee> {
    int ID;
    String Name;
    int Salary;
    
    Employee(int ID,String Name,int Salary){
    	this.ID=ID;
    	this.Name=Name;
    	this.Salary=Salary;
    }
	@Override
	public int compareTo(Employee o) {
		if(ID==o.ID)
		return 0;
		else if(ID>o.ID)
			return 1;
		else
			return -1;
	}

}
