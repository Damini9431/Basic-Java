package com.assignment;
import java.util.Scanner;
public class NthBitCheck {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		System.out.println("Enter a bit position of Nth:");
		int n = sc.nextInt();
		sc.close();
		
        if ((num & (1 << n)) != 0) {
            System.out.println("The " + n + "th bit of " + num + " is set (1).");
        } else {
            System.out.println("The " + n + "th bit of " + num + " is not set (0).");
        }

	}

}  
