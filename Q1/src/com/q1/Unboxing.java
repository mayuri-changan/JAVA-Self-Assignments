package com.q1;

public class Unboxing {

	public static void main(String[] args) {
		
		Integer num=1000;
		int obj1=num.intValue();       //Manually	
		int obj2=num;                 //Auto
		
		System.out.println("Manually:"+obj1);
		System.out.println("Auto:"+obj2);


	}

}

