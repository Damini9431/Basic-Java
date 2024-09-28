package com.encapsulation;
import java.util.Scanner;
public class PMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        Person p1 = new Person();

        System.out.print("Enter your age: ");
        int inputAge = scanner.nextInt();
        
        p1.setAge(inputAge);

        if (p1.isEligibleForCourse()) {
            System.out.println("You are eligible for the course.");
        } else {
            System.out.println("You are not eligible for the course.");
        }

        scanner.close();
        }

}
