package com.charactermethods;

public class DigitLetter {

	public static void main(String[] args) {
		char ch='P';
		
		if(Character.isDigit(ch))
		{
			System.out.println("given character class is a number");
		}
		else if(Character.isLetter(ch))
		{
			System.out.println(" given Character class is a letter");
		}
		
	}

}
