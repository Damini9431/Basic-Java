package com.comparatorInterface;
import java.util.Comparator;
public class Age implements Comparator<Student>{
    @Override
	public int compare(Student o1, Student o2) {
		if(o1.age==o2.age)
		return 0;
		else if(o1.age>o2.age)
			return 1;
		else
			return -1;
	}
}
