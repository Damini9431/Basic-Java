package com.assignment;
public abstract class Vaccine {
	int age;
    String nationality;
    boolean firstDoseCompleted = false; 

    public Vaccine(int age, String nationality) {
        this.age = age;
        this.nationality = nationality;
    }

    public void firstDose() {
        if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
            System.out.println("First dose administered. You have to pay 250rs.");
            firstDoseCompleted = true; 
        } else {
            System.out.println("You are not eligible for the first dose.");
        }
    }

    public void secondDose() {
        if (firstDoseCompleted) {
            System.out.println("Second dose administered.");
        } else {
            System.out.println("You need to complete the first dose before taking the second dose.");
        }
    }

    public abstract void boosterDose();
}
