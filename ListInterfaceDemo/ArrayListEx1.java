package com.ListInterfaceDemo;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListEx1 {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		 a1.add(75);
		  a1.add(400);
		  a1.add(40);
		  System.out.println("a1="+a1);
		  ArrayList a1_duplicate=new ArrayList();
		  a1_duplicate.addAll(a1);
		 System.out.println(a1_duplicate);
		 a1_duplicate.removeAll(a1_duplicate);
		 System.out.println(a1);
		 //sort Collections sort 
		 Collections.sort(a1);
		 System.out.println("after sorting="+a1);
		 }

}
