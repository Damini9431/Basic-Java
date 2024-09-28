package com.QueueInterfaceDemo;
import java.util.PriorityQueue;
public class PriorityQueueEx {

	public static void main(String[] args) {
     PriorityQueue<String> p=new PriorityQueue();
     p.add("Java");
     p.add("C");
     p.add("SQL");
     p.add("Python");
     p.add("HTML");
     p.offer("CSS");
     System.out.println(p);
     System.out.println(p.size());
     System.out.println(p.remove());
     System.out.println(p.poll());
     System.out.println(p.element());
     System.out.println(p.peek());
	}

}
