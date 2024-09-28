package com.project;

	public class Student{
		String name;
		    String dept;
		    String loc;

		    public void print_info()
			{
				System.out.println("My name is Damini");
				System.out.println("My department is B.tech CSE");
				System.out.println("I am from Ranchi");
			}

			public static void main(String[] args) {
				
				Student s1 = new Student();
				s1.name = "Damini";
				s1.dept = "B.Tech";
				s1.loc = "Ranchi";
				
				System.out.println(s1.name);
				System.out.println(s1.dept);
				System.out.println(s1.loc);

			}

		}	    
		    
