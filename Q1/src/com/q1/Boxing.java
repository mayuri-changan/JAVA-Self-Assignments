package com.q1;

public class Boxing {

	public static void main(String[] args) 
	{
		int num=10;
		Integer manuallyboxednum=Integer.valueOf(num);    //manually
		Integer autoboxednum=(num);                       //auto
		System.out.println("Manullay:"+manuallyboxednum);
		System.out.println("Auto :"+autoboxednum); 
			
	}

}