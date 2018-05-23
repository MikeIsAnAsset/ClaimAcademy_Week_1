package com.mike_win.assignment_2;

import java.util.Scanner;

public class StringsBonus {

	public static void main(String[] args) {
		// Get user input and declare variables
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String input = in.nextLine();
		
		// Invoke method
		boolean result = isEachCharUnique(input);
		
		// Print to console
		System.out.println(result);
		
	}

	private static boolean isEachCharUnique(String input) {
		// Loop through each letter of string and count occurrences of each letter
		for (int i = 0; i < input.length(); i++) {
			for (int j = 1; j < input.length(); j++) {
				if (input.charAt(i) ==  input.charAt(j))
					
			}
			
			input.charAt(0)
		}
		return false;
	}

	Declare and defin method
}
