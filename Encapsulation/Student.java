package com.encapsulation;

public class Student {

	public String name;
	private String password;
	protected String msg="try to access protected data within package";
	//method
	protected void msg() {
		System.out.println("access outside package with inheritance");
	}
	//setter and getter
	//get
	public String getPassword() {
		return password;
	}
	//set
	public void setPassword(String password) {
		this.password=password;
	}
}
