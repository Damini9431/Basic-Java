package com.Polymorphism;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add : " + calc.add(10, 20));           
        System.out.println("Subtract : " + calc.subtract(20, 10));  
        System.out.println("Multiply : " + calc.multiply(5, 4));   
        System.out.println("Divide : " + calc.divide(20, 4));         
    }
}
