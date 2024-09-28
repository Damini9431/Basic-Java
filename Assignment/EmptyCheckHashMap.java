package com.assignment;
import java.util.HashMap;
public class EmptyCheckHashMap {
   public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        
        if(map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }
        map.put(1, "Damini");
        map.put(2, "Harshu");
        map.put(2, "Harmesh");
        
        if (map.isEmpty()) {
            System.out.println("The HashMap is empty.");
        } else {
            System.out.println("The HashMap contains key-value mappings.");
        }
    }
}