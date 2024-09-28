package com.inheritance;

public class Main3 {

	public static void main(String[] args) {
		//object creation for Local_Business
		Local_Business i1=new Local_Business("Global plus solution ");
		i1.disp_name();
		i1.Local_detail();
    	//object creation for International_Business
		International_Business i2=new International_Business("Horizon Trade ");
		i2.disp_name();
		i2.International_detail();
		
	}

}
