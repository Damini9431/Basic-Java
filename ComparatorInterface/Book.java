package com.comparatorInterface;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Book {
   public static void main(String[] args) {
		HashMap<String,Double> ab=new HashMap<String,Double>();
		ab.put("Social Science",450.0);
		ab.put("GK",350.0);
		ab.put("English",450.0);
		ab.put("Hindi",500.0);
		ab.put("Math",250.0);
		//ab.get(ab);
		System.out.println(ab);
		System.out.println(ab.entrySet());
		//KeySet ValueSet
		for(String s1:ab.keySet()) {
			System.out.println("Key set are = "+s1);
			}
		for(Double d:ab.values()) {
			System.out.println("Values= "+d);
		}
		//map convert set
		Set<Map.Entry<String,Double>> s=ab.entrySet();
		ab.put("Science",350.0);
		
		for(Map.Entry<String,Double> it :s) {
			System.out.println("single entry reading= "+it.getKey()+" "+it.getValue());
			}
        }
}

