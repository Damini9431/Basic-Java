package com.staticExample;

public class AJP {
       int id;
       String name;
   static String project_name="AJP";
   AJP(int id,String name){
	  this.id=id;
	  this.name=name;
   }
  //static method
  static void print() {
	    System.out.println("print details..");
  }
   //block
   static {
	    System.out.println("I am in static block");
   }
   //display
   void display() {
	    System.out.println(id+""+name+""+project_name);
  }
  public static void man(String[] args) {
	    AJP a1=new AJP(1,"Damini");
	    AJP a2=new AJP(1,"Divya");
	    AJP a3=new AJP(1,"Megha");
	    AJP a4=new AJP(1,"Ritika");
	    a1.display();
	    a2.display();
	    a3.display();
	    a4.display();
  }
}
