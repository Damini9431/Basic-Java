package com.comparatorInterface;
import java.util.Comparator;
public class ID implements Comparator<Employee>{
    @Override
	public int compare(Employee o1, Employee o2) {
		if(o1.ID==o2.ID)
		return 0;
		else if(o1.ID>o2.ID)
			return 1;
		else
			return-1;
	}
}
