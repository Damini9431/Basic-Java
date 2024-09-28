package com.assignment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class ReverseStringList {
     public static void main(String[] args) {
        List<String> s1 = new ArrayList<>();
        s1.add("HTML");
        s1.add("Java");
        s1.add("CSS");
        s1.add("C++");
        s1.add("JavaScript");
        s1.add("Python");
        System.out.println("Original List:- " + s1);
        Collections.reverse(s1);
        System.out.println("Reversed List:- " + s1);
    }
}