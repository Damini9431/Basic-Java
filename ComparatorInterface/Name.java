package com.comparatorInterface;
import java.util.Comparator;
public class Name implements Comparator<Student> {
    @Override
	public int compare(Student o1, Student o2) {
		//this method is from string class
		return o1.name.compareTo(o2.name);
	}
}
