package com.assignment;
public class Parenthesis {
	 public static int findClosingParenthesis(String sentence, int openPos) {
	        if (sentence.charAt(openPos) != '(') {
	            System.out.println("The character at position " + openPos + " is not an opening parenthesis.");
	            return -1;
	        }
            int openCount = 0;

	        for (int i = openPos; i < sentence.length(); i++) {
	            char currentChar = sentence.charAt(i);

	            if (currentChar == '(') {
	                openCount++;  
	            } else if (currentChar == ')') {
	                openCount--;  

	                if (openCount == 0) {
	                    return i;
	                }
	            }
	        }
	        return -1;
	    }

	    public static void main(String[] args) {
	        String sentence = "Sometimes (when I nest my parenthesis (also called parentheticals) too many times (like this (and this))) they get quite confusing.";
	        int openingPos = 10;

	        int closingPos = findClosingParenthesis(sentence, openingPos);

	        if (closingPos != -1) {
	            System.out.println("The matching closing parenthesis for the opening at position " + openingPos + " is at position " + closingPos + ".");
	        } else {
	            System.out.println("No matching closing parenthesis found.");
	        }
	    }
}
