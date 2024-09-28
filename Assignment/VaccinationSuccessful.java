package com.assignment;
public class VaccinationSuccessful extends Vaccine {
	    public VaccinationSuccessful(int age, String nationality) {
	        super(age, nationality);
	    }

	    @Override
	    public void boosterDose() {
	        if (firstDoseCompleted) {
	            System.out.println("Booster dose administered successfully.");
	        } else {
	            System.out.println("You need to complete the first and second doses before taking the booster dose.");
	        }
	    }
}

