package com.genricsDemo;

public class GenericsMethod {
    public static<E>void printArray(E[] elements){
    	for(E e:elements) {
    		System.out.println(e);
    	}
    	System.out.println();
    }
	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5};
		Character[] charArray= {'p','y','t','h','o','n'};
		System.out.println("print int array=");
		printArray(intArray);
		System.out.println("print char array=");
		printArray(charArray);

	}

}
