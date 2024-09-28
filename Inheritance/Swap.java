package com.inheritance;
import java.util.Scanner;
public class Swap {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first  no:");
		int a = sc.nextInt();
		
		System.out.println("Enter second no:");
		int b = sc.nextInt();
		
		a=a-b;
		b=a+b;
		a=b-a;
System.out.println("numbers is "+a+" "+b);
sc.close();
	}
} 
