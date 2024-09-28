package com.assignment;
class Animal {
	public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks...");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows...");
    }
}
public class MainADC {
	 public static void main(String[] args) {
	        Animal a1=new Animal();
	        a1.makeSound();
	        Dog d1=new Dog();
	        d1.makeSound();
	        Cat c1=new Cat();
	        c1.makeSound();
	    }
}
