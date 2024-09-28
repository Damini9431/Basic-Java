package com.setInterfaceEx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class ConvertSetIntoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashSet<Integer> s1=new HashSet<Integer>();
       s1.add(10);
       s1.add(40);
       s1.add(44);
       s1.add(70);
       s1.add(10);
       System.out.println("set="+s1);
       
       ArrayList<Integer> h1=new ArrayList<Integer>(s1);
       System.out.println("ArrayList="+h1);
       h1.add(30);
       //sort
       Collections.sort(h1);
       System.out.println("After sorting="+h1);
       
	}

}
