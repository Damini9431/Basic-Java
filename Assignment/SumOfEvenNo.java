package com.assignment;
import java.util.ArrayList;
public class SumOfEvenNo {
    public static void main(String[] args) {
        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(12);
        n1.add(31);
        n1.add(32);
        n1.add(45);
        n1.add(54);
        n1.add(75);
        System.out.println("Original List: " + n1);
        
        int sumOfEvens = 0;
        for (int number : n1) {
            if (number % 2 == 0) {
                sumOfEvens += number;
            }
        }
        System.out.println("Sum of even numbers: " + sumOfEvens);
    }
}