package com.exception;

public class NullPointer {

	public static void main(String[] args) {
		String STR=null;
		try {
			System.out.println( "length of string:" + STR.length());
		}catch (NullPointerException e) {
            System.out.println("NullPointerException Caught");
           }
            System.out.println("This is Null Pointer Exception...");
	}

}
