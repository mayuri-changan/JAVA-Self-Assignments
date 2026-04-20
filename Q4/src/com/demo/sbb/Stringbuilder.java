package com.demo.sbb;

public class Stringbuilder
{

	public class StringBuilderDemo 
	{
	    public static void main(String[] args) 
	    {

	        StringBuilder sb = new StringBuilder("himayurichangan");

	        sb.append(" helloo");
	        sb.insert(5, " java");
	        sb.replace(0, 5, "hi");
	        sb.delete(2, 7);

	        System.out.println("StringBuilder result: " + sb);
	    }
	}
}
	
