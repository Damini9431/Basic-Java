package com.ListInterfaceDemo;
import java.util.ArrayList;
public class ArrayListEx {
public static void main(String[] args) {
	ArrayList a1=new ArrayList();
	a1.add(100);
	a1.add('c');
	a1.add(true);
	a1.add(2.4);
	a1.add("Hello");
	a1.add(null);
	System.out.println(a1);
	//size
	System.out.println("size of list="+a1.size());
	a1.remove(2);
	System.out.println(a1);
	System.out.println(a1.get(2));
	//replace
	a1.set(2, "welcome");
	System.out.println(a1);
	System.out.println(a1.contains("java"));
	//for each read
			for (Object o : a1) {
				System.out.println("Reading the data from list="+o);
			}
}
}
