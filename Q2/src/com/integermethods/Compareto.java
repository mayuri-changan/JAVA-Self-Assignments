package com.integermethods;

public class Compareto {

	public static void main(String[] args) {
		Integer a=30;
		Integer b=30;
		int Result = a.compareTo(b);
		System.out.println(Result);
		if(Result==0)
		{
			System.out.println("equal");
		}
		else if(Result>0)
		{
			System.out.println("greater");
			
		}
		else if(Result<0)
		{
			System.out.println("less");
			

	}


		
	}

}
