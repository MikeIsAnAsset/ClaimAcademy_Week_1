package com.mike_win.assignment_2;

import java.util.Scanner;

public class RemoveChar_2_4 {

	public static void main(String[] args) {
		// Declare and define variables and get input
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");	
		String wordOrPhrase = in.nextLine();

		System.out.print("Enter a character: ");
		String givenChar = in.nextLine();
		
		// Print to console result of calling method
		System.out.print(newString(givenChar, wordOrPhrase));
	}
	// Declare and define method
	private static String newString(String character, String wordOrPhrase) {
		// Convert input to all lowercase
		// wordOrPhrase.toLowerCase();
		String newWord = wordOrPhrase.toLowerCase().replaceAll(character, "");
		return newWord;
	}
	
	

	
	// Remove character from converted input
}
