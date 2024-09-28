package com.assignment;
import java.util.TreeMap;
public class TreeMapEx {
    public static void main(String[] args) {
        TreeMap<String, Integer> t1 = new TreeMap<>();
        t1.put("One", 1);
        t1.put("Two", 2);
        t1.put("Three", 3);
        System.out.println("Original TreeMap:- " + t1);
        String keyToRemove = "Two";
        Integer removedValue = t1.remove(keyToRemove);
        System.out.println("Removed value = " + removedValue);
        boolean isEntryRemoved = !t1.containsKey("Three");
        System.out.println("Is the entry {Three=3} removed? " + isEntryRemoved);
        System.out.println("Updated TreeMap:- " + t1);
    }
}