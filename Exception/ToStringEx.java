package com.exception;

public class ToStringEx {

	public static void main(String[] args) {
		int a=6;
	      int b=0;
	        try{
	          System.out.println(a/b);
	        }
	      catch(ArithmeticException e){
	        e.toString();
	      }
	}

}
