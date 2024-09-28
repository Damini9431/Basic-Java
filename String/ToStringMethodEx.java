package com.string;

public class ToStringMethodEx {
	int rollno;
	String name;
	public ToStringMethodEx(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}

	//override toString method
	public String toString() {
		return rollno+""+name;
	}
	public static void main(String[] args) {
		ToStringMethodEx s1=new ToStringMethodEx(1,"Damini");
		ToStringMethodEx s2=new ToStringMethodEx(2,"Divya");
		
		System.out.println(s1);
		System.out.println(s2);
	}

	

}
