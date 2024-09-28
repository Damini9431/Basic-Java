package com.arrayOfObjects;
public class ArrayOfObjects {

	public static void main(String[] args) {
Student [] arr;
arr=new Student[3];
arr[0]=new Student(101,"Damini","A");
arr[1]=new Student(101,"Divya","A");
arr[2]=new Student(101,"Ritika","A");
System.out.println(" First Student data=");
arr[0].display();
System.out.println(" First Student data=");
arr[1].display();
System.out.println(" First Student data=");
arr[2].display();
	}
	}
class Student{
	int rollno;
	String name;
	String grade;
	//constructor
	Student(int rollno,String name,String grade){
		this.rollno=rollno;
		this.name=name;
		this.grade=grade;
	}
	
	//display
	public void display() {
		System.out.println("Student data:"+rollno+""+name+""+grade);
	}
}

