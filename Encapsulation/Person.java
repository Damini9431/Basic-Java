package com.encapsulation;

public class Person {
	private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public boolean isEligibleForCourse() {
        return age <= 24;
    }
}
