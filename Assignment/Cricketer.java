package com.assignment;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Cricketer {
    public static void main(String[] args) {
        Map<String, Integer> c1 = new HashMap<>();
        c1.put("Virat Kohli", 28426);
        c1.put("Sachin Tendulkar", 22545);
        c1.put("MS Dhoni", 30773);
        c1.put("Brian Lara", 19837);
        c1.put("Rohit Sharma", 10405);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cricketer's name to search his score: ");
        String cricketerName = sc.nextLine();

        if (c1.containsKey(cricketerName)) {
            int score = c1.get(cricketerName);
            System.out.println(cricketerName + " scored " + score + " runs.");
        } else {
            System.out.println("Cricketer not found in records.");
        }
        sc.close();
    }
}
