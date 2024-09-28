package com.comparatorInterface;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class IteratorInterface {

	public static void main(String[] args) {
         List<String> list=new ArrayList<>();
         list.add("Java");
         list.add("Python");
         list.add("Php");
         list.add("Css");
         Iterator<String> itr=list.iterator();
         while(itr.hasNext()) {
         String element=itr.next();
         System.out.println(element);
	     }
	}
}
