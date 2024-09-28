package com.assignment;
import java.util.HashMap;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Damini");
        map.put(2, "Rahul");
        map.put(3, "Megha");
        map.put(4, "Raj");
        map.put(5, "Shreya");
        System.out.println("HashMap after adding elements:- " + map);
        map.put(6, "Aryan");
        System.out.println("HashMap after adding new key-value pair:- " + map);
    }
}