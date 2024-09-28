package com.comparatorInterface;
import java.util.ArrayList;
import java.util.Collections;
public class MainEmp {
        public static void main(String[] args) {
	        ArrayList<Employee> ab=new ArrayList<Employee>();
			ab.add(new Employee(101,45000));
			ab.add(new Employee(103,34000));
			ab.add(new Employee(104,35000));
			ab.add(new Employee(102,24000));
			//sorting as per ID
			Collections.sort(ab,new ID());
			System.out.println("sorting data by ID=");
			for (Employee obj : ab) {
				System.out.println(obj.ID+" "+obj.Salary);
			}
			//sorting as per Salary
			Collections.sort(ab,new Salary());
				System.out.println("sorting data by Salary=");
				for (Employee obj1 : ab) {
					System.out.println(obj1.ID+" "+obj1.Salary);
				}
			}
}