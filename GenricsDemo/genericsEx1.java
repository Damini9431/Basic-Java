package com.genricsDemo;
class Test1<T,U>{
	T obj1;
	U obj2;
	Test1(T obj1,U obj2)
	{
		this.obj1=obj1;
		this.obj2=obj2;
	}
	public void print()
	{
		System.out.println(obj1);
		System.out.println(obj2);
	}
}
public class genericsEx1 {
   public static void main(String[] args) {
		Test1<Integer,String> iobj=new Test1<Integer,String>(20,"HelloWorld");
		System.out.println("printing date");
		iobj.print();
    }
}
