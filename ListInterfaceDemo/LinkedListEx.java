package com.ListInterfaceDemo;
import java.util.Collections;
import java.util.LinkedList;
public class LinkedListEx {
	public static void main(String[] args) {
		LinkedList<Integer>ab=new LinkedList();
		    ab.add(100);
			ab.add(400);
			ab.add(2);
			System.out.println(ab);
			ab.addFirst(20);
			ab.addLast(500);
			System.out.println(ab);
			ab.removeFirst();
			System.out.println(ab);
			ab.removeLast();
			System.out.println(ab);
			System.out.println("size of list="+ab.size());
			Collections.sort(ab);
			System.out.println("after sorting="+ab);
			ab.set(1,96);
			System.out.println(ab);
		}

	}

