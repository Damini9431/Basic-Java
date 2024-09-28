package com.exception;

import java.util.Scanner;

@SuppressWarnings("serial")
class UserDefineException extends Exception{
	
	UserDefineException(){
	}
}

public class LeapYearEx {

	public void validate(int year) throws UserDefineException{
		if(year%4 != 0) {
			throw new UserDefineException();
		} else {
			System.out.println("This is a leap year...");
		}
	}
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year : ");
		int year = sc.nextInt();
		
		LeapYearEx y = new LeapYearEx();
		
		try {
			y.validate(year);
		} catch(UserDefineException e){
			System.out.println("Exception occurred");
		}
		
		sc.close();
	}
}
