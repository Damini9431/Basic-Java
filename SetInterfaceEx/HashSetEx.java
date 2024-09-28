package com.setInterfaceEx;
import java.util.HashSet;
public class HashSetEx {
	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet<Integer>();
	     set1.add(1);
	     set1.add(2);
	     set1.add(3);
	     set1.add(4);
	     set1.add(5);
	     set1.add(6);
	     System.out.println("set1="+set1);
	     
	     HashSet<Integer> set2=new HashSet<Integer>();
	     set2.add(1);
	     set2.add(2);
	     set2.add(3);
	     set2.add(4);
	     set2.add(5);
	     System.out.println("set2="+set2);
	     //union addAll
	     set1.addAll(set2);
	     System.out.println("union of set 1 and 2="+set1);
	     //retain
	     set1.retainAll(set2);
	     System.out.println("insertion="+set1);
	     //uncommon
	     set1.removeAll(set2);
	     System.out.println("difference="+set1);
	}
}
