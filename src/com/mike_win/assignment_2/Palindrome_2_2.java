package com.mike_win.assignment_2;

import java.util.Scanner;

public class Palindrome_2_2 {

	private static final boolean False = false;
	private static final boolean True = false;

	public static void main(String[] args) {
		// Get user input and declare variables
		Scanner in = new Scanner(System.in);
		String input;
		
		System.out.print("Enter your word or phrase: ");
		input = in.nextLine();
		
		

		// Print to console result of calling function
		System.out.println("This input is a palindrome: " + isPalindrome(input));
	}

	private static String isPalindrome(String input) {
		String newWord = "";
		for (int i=0; i < input.length(); i++) {
			if (input.charAt(i) == input.charAt(input.length()-1-i)) {
				newWord += input.charAt(i);
			}
		}	
		
		if (newWord.equals(input)) {
			return "True";	
		}
		return "False";
	}

}
