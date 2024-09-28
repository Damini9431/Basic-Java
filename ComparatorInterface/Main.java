package com.comparatorInterface;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
        public static void main(String[] args) {
		//arrayList
		ArrayList<Student> a1=new ArrayList<Student>();
		//add 
		a1.add(new Student(20,"abc"));
		a1.add(new Student(18,"xyz"));
		a1.add(new Student(11,"pqr"));
		//sorting as per age
		Collections.sort(a1,new Age());
		System.out.println("sorting data by age=");
		for (Student obj : a1) {
			System.out.println(obj.age+" "+obj.name);
		}
		//multiple
			Collections.sort(a1,new Name());
			System.out.println("sorting data by name=");
			for (Student obj1 : a1) {
				System.out.println(obj1.age+" "+obj1.name);
			}
		}
}
