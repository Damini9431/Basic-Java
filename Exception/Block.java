package com.exception;

public class Block {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	int a=100/0;
    	 System.out.println(a);
    }catch(ArithmeticException e) {
    	System.out.println(e);
    	}
    finally {
    System.out.println("Here is the code..");
    System.out.println("Finally block is executed..");
	}
	}
}
