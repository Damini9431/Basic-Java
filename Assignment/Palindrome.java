package com.assignment;
import java.util.Scanner;
public class Palindrome {
	 public static boolean isPalindrome(String str) {
	        str = str.toLowerCase();
	        int start = 0;
	        int end = str.length() - 1;

	        while (start < end) {
	            if (str.charAt(start) != str.charAt(end)) {
	                return false;
	            }
	            start++;
	            end--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String inputString = scanner.nextLine();
	        if (isPalindrome(inputString)) {
	            System.out.println(inputString + " is a Palindrome.");
	        } else {
	            System.out.println(inputString + " is not a Palindrome.");
	        }

	        scanner.close();
	    }
	}

