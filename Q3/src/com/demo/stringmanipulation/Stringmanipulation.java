
/*Create String Demo class and perform different string manipulation
methods. */
package com.demo.stringmanipulation;
public class Stringmanipulation{
	public static void main(String[] args) {
		String s="Hello Mayuri Welcome in cDAC";
		String s1="  hello java  ";
		String s2="core java";
		String s3="Hello";
		
		//length
		System.out.println("\nlength of string is:"+s.length());
		
		//upper case
		System.out.println("\nuppercase:"+s.toUpperCase());
		
		//lower case
		System.out.println("\nlowercase:"+s.toLowerCase());
		
		//replace
		System.out.println("\nreplace:"+s.replace('c',' '));
		
		//trim
		System.out.println("\ntrim:"+s1.trim());
		
		//charAt
		System.out.println("\ncharacter at specific index position:"+s.charAt(6));
		
		//substring
		System.out.println("\ncharacter at starting index position and ending index postion:"+s.substring(0,12));
		
		//equals
		System.out.println("\nvalue is equal:"+s1.equals("java"));
		System.out.println("\nvalue is equal:"+s2.equals("core java"));
		
		//equals ignore case
		System.out.println("\nequalsIgnore:"+s2.equalsIgnoreCase("Core JaVa"));
		
		
		//conCat
		System.out.println("\nconcat is:"+s3.concat(" Mayuri"));
		
		
		//contains
		System.out.println("\ncontains is:"+s3.contains("llo"));
		System.out.println("\ncontains is:"+s3.contains("ho"));
			

	}

}
