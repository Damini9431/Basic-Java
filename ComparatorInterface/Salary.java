package com.comparatorInterface;
import java.util.Comparator;
public class Salary implements Comparator<Employee> {
    @Override
	public int compare(Employee o1, Employee o2) {
    	if(o1.Salary==o2.Salary)
    		return 0;
    		else if(o1.Salary>o2.Salary)
    			return 1;
    		else
    			return-1;
	}
}