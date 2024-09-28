package com.encapsulation;

public class Employee1 {
	public String name;
	private String id;
	protected String email="try to access this protected email";
	protected void emaill() {
		System.out.println("access this protected email");
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id=id;
	}
}
