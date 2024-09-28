package com.string;

public class StringBufferEx1 {

	public static void main(String[] args) {
		StringBufferEx1 s=new StringBufferEx1();
		//Sting s=s.concat("hello");
		System.out.println(s.capacity());
		s.append("Hello");
		System.out.println(s.capacity());
		s.append("Damini");
		String msg=s.toString();
		System.out.println(msg);

	}

	private char[] capacity() {
		// TODO Auto-generated method stub
		return null;
	}

	private void append(String string) {
		// TODO Auto-generated method stub
		
	}

}
