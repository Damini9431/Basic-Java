package com.setInterfaceEx;
import java.util.HashSet;
public class HashSetExample {
	public static void main(String[] args) {
     HashSet ab=new HashSet(100);
     ab.add('H');
     ab.add(400);
     ab.add(null);
     ab.add(4.5);
     ab.add(true);
     System.out.println(ab);
     System.out.println(ab.contains('a'));
		ab.remove(3);
		System.out.println(ab);
		System.out.println(ab.size());
		System.out.println(ab.isEmpty());
    }
}