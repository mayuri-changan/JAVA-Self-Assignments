package com.charactermethods;

public class Isnotanumber {

	public static void main(String[] args) {
		double num=1;
		if(Double.isNaN(num))
		{
			System.out.println("not a number");
		}
		else
		{
			System.out.println("number is invalid");
		}
		

	}

}
