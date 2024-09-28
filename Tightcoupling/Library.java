package com.Tightcoupling;

public class Library {
	Books b;
	Library(){
		b=new Books();
	}
public void read() {
	System.out.println("Library contains books:");
}
}
