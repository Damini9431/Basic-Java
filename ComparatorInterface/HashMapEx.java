package com.comparatorInterface;
import java.util.HashMap;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<Integer,String> h1=new HashMap<>();
    h1.put(1, "Damini");
    h1.put(2, "Riya");
    h1.put(3, "Rahul");
    h1.put(null, "Megha");
	System.out.println(h1);
	System.out.println(h1.get(1));
	System.out.println(h1.remove(2));
	System.out.println(h1.containsKey(3));
	System.out.println(h1.isEmpty());
	System.out.println(h1.size());
    h1.clear();		
	}

}
