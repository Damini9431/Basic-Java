package com.exception;
import java.util.Scanner;
public class Exception1 extends Exception {
	
	Exception1(String msg){
		super(msg);
	}
	
 
	  static void ValidUpi(int upi_id) throws Exception1{
		  if(upi_id!=1234) {
			  throw new Exception1("Upi id is not correct");
		  }
		  else {
			  System.out.println("Your Upi id is Valid");
		  }
		  
	  }
	  public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  int a=sc.nextInt();
			 try {
				 ValidUpi(a);
			 }
			 catch(Exception1 e) {
				 System.out.println("Exception occur");
			 }
	  }
}