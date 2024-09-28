package com.comparatorInterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class HashMapEx1 {
	public static void main(String[] args) {
    HashMap<Integer,String> h1=new HashMap<>();
    h1.put(1, "Damini");
    h1.put(67, "Riya");
    h1.put(3, "Rahul");
    h1.put(24, "Megha");
    h1.put(34, "Surbhi");
    h1.put(12, "Priya");
	System.out.println(h1);
	/*System.out.println(h1.get(1));
	System.out.println(h1.remove(2));
	System.out.println(h1.containsKey(3));
	System.out.println(h1.isEmpty());
	System.out.println(h1.size());
    h1.clear();	*/
    System.out.println(h1.entrySet());
    for(int i : h1.keySet()) {
    	System.out.println("key set are="+i);
    }
    for(Object obj : h1.values()) {
    	System.out.println("values are="+obj);
    }
    Set<Map.Entry<Integer,String>> s=h1.entrySet();
    for(Map.Entry<Integer,String> it:s) {
    	System.out.println("single entry reading="+it.getKey()+""+it.getValue());
    }
	}
}
