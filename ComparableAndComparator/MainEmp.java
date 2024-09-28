package com.ComparableAndComparator;
import java.util.ArrayList;
import java.util.Collections;
public class MainEmp {
   public static void main(String[] args) {
		ArrayList<Employee> ab=new ArrayList<Employee>();
		ab.add(new Employee(111,"Damini",45000));
		ab.add(new Employee(112,"Divya",35000));
		ab.add(new Employee(113,"Ritika",40000));
		ab.add(new Employee(114,"Megha",55000));
		Collections.sort(ab);
		for(Employee obj : ab) {
			System.out.println(obj.ID+""+obj.Name+""+obj.Salary);
		}
	}

}
