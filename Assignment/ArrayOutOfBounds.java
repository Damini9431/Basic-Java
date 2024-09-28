package com.assignment;
public class ArrayOutOfBounds {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        try {
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println("Accessing element at index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught....");
            System.out.println("Invalid index accessed: " + e.getMessage());
        }
    }
}