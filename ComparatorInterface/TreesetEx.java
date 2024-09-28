package com.comparatorInterface;
import java.util.Iterator;
import java.util.TreeSet;
public class TreesetEx {

	public static void main(String[] args) {
       TreeSet<String> t1=new TreeSet<>();
       t1.add("Puja");
       t1.add("Raju");
       t1.add("Harsh");
       t1.add("Suraj");
       t1.add("Radha");
       Iterator<String> itr=t1.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       }
	}

}
