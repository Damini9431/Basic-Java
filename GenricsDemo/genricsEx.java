package com.genricsDemo;
class Test<T>{
	T obj;
	Test(T obj){this.obj=obj;}
	public T getObject() {return this.obj;}
}
public class genricsEx {

	public static void main(String[] args) {
			Test<Integer> iObj=new Test<Integer>(18);
			System.out.println(iObj.getObject());
			Test<String> sObj=new Test<String>("Hello");
			System.out.println(sObj.getObject());
		}

	}
