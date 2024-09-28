package com.ComparableAndComparator;
import java.util.ArrayList;
import java.util.Collections;
public class MainStud {
     public static void main(String[] args) {
		//arrayList
		ArrayList<Student> a1=new ArrayList<Student>();
				//add 
				a1.add(new Student(101, "abc", 20));
				a1.add(new Student(102, "xyz", 18));
				a1.add(new Student(103, "pqr", 21));
				//sorting
				Collections.sort(a1);
				//for
				for (Student obj : a1) {
					System.out.println(obj.rollno+" "+obj.name+" "+obj.age);
				}
			}
		}
