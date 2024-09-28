package com.abstraction;

	public class Calculator1 implements Calculator {

		@Override
		public void addition(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println("Addition of numbers is : " +(a+b) );
		}

		@Override
		public void sub(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println("Substraction of numbers is : " + (a-b));
		}

		@Override
		public void multi(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println("Multiplication of numbers is : " + (a*b));
		}
	public void div(int a, int b) {
			// TODO Auto-generated method stub
			System.out.println("Division of numbers is : " + (a/b));
		}

		public static void main(String args[]) {
			
			Calculator c1 = new Calculator1();
			c1.addition(2, 5);
			c1.sub(13, 5);
			c1.multi(4, 5);
			c1.div(6, 4);
		}
	}
