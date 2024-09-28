package com.string;

public class StringCompare {

	public static void main(String[] args) {
		String data1="java";
		String data2="java";
		String data3= new String("java");
		//==memory address
		//equal contents
        boolean result= data1.equals(data3);
        System.out.println(result);
        System.out.println(data1==data2);
        System.out.println(data1==data3);
	}

}
