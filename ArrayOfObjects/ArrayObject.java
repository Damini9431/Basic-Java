package com.arrayOfObjects;

public class ArrayObject {

	public static void main(String[] args) {
		Employee [] arr;
		arr=new Employee[3];
		arr[0]=new Employee(1,"Damini",34000);
		arr[1]=new Employee(2,"Divya",32000);
		arr[2]=new Employee(3,"Ritika",45000);
		System.out.println(" First Employee data=");
		arr[0].display();
		System.out.println(" Second Employee data=");
		arr[1].display();
		System.out.println(" Third Employee data=");
		arr[2].display();
			}
			}
		class Employee{
			int id;
			String name;
			double salary;
			//constructor
			Employee(int id,String name,double salary){
				this.id=id;
				this.name=name;
				this.salary=salary;
			}
			
			//display
			public void display() {
				System.out.println("Employee data:"+id+""+name+""+salary);
			}
		}


