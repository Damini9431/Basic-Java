package com.assignment;
import java.util.HashSet;
public class AppendHashSet {
     public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Damini");
        set.add("Divya");
        set.add("Surbhi");
        set.add("Megha");
        System.out.println("Original HashSet:- " + set);
        set.add("Ritika");
        System.out.println("Updated HashSet:- " + set);
    }
}