package com.assignment;
import java.util.Map;
import java.util.TreeMap;
public class TreeMapNavigate {
     public static void main(String[] args) {
        TreeMap<String, Integer> t1 = new TreeMap<>();
        t1.put("One", 1);
        t1.put("Two", 2);
        t1.put("Three", 3);
        t1.put("Four", 4);
        t1.put("Five", 5);
        System.out.println("TreeMap:- " + t1);
        // 1. Using for-each loop with entrySet()
        System.out.println("Using for-each loop with entrySet():");
        for (Map.Entry<String, Integer> entry : t1.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        // 2. Using for-each loop with keySet()
        System.out.println("\nUsing for-each loop with keySet():");
        for (String key : t1.keySet()) {
            System.out.println(key + " = " + t1.get(key));
        }
        // 3. Using Iterator with entrySet()
        System.out.println("\nUsing Iterator with entrySet():");
        var iterator = t1.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
        // 4. Using Stream API
        System.out.println("\nUsing Stream API:");
        t1.entrySet().stream()
            .forEach(entry -> System.out.println(entry.getKey() + " = " + entry.getValue()));
        // 5. Using descendingMap() to navigate in reverse order
        System.out.println("\nNavigating in reverse order using descendingMap():");
        for (Map.Entry<String, Integer> entry : t1.descendingMap().entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}