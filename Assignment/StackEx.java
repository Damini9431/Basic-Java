package com.assignment;
import java.util.Stack;
public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        System.out.println("Stack after pushing 10 elements:- " + stack);

        for (int i = 0; i < 4; i++) {
            Integer removedElement = stack.pop();
            System.out.println("Popped element: " + removedElement);
        }
        System.out.println("Stack after popping 4 elements:- " + stack);
    }
}
