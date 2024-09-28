package com.exception;

public class GetMessageEx {

	public static void main(String[] args) {
		int a=4;
	      int b=0;
	        try{
	          System.out.println(a/b);
	        }
	      catch(ArithmeticException e){
	        e.getMessage();
	      }
	}

}
