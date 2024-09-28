package com.exception;
@SuppressWarnings("serial")
class UserDefinedException extends Exception{
	UserDefinedException(String msg){
		 //call parent cons
		 super(msg);
	 } 
}

public class TestUserException{	 

//method 
	static void vaildAge(int age)throws UserDefinedException {
		if(age<18){
			//throws
			throw new UserDefinedException("persone is not vaild");
		}
		else{
			System.out.println("welcome to vote..");
		}
	
	}
	public static void main(String args[]){
		try{
			//method call
			vaildAge(20);
		}catch(UserDefinedException e) {
			System.out.println("Exception occured");
		}
	}
}