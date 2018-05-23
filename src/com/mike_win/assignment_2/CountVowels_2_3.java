package com.mike_win.assignment_2;

import java.util.Scanner;

public class CountVowels_2_3 {

	public static void main(String[] args) {
		// Get input; Declare/define variables
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = in.nextLine();
		in.close();
		
		// Call method that counts vowels
		int result = countVowels(word);
		
		// print result of function
		System.out.println("Number of vowels in " + word + " are " +result);
	}

	// Declare/define method
	private static int countVowels(String word) {
		// Define and initialize variable to hold vowels
		String[] vowels = {"a", "e", "i", "o", "u"};
		
		// Counter of vowels
		int numVowels = 0;
		
		// Convert string to all lowercase
		String lowercaseString = word.toLowerCase();
		
		// Count vowels
		for (String c : vowels) {
			for (int i=0; i < lowercaseString.length(); i++) {
				if (c.equals(String.valueOf(lowercaseString.charAt(i)))) {
					++numVowels;
			}
		}
		
		}
		return numVowels;
	}
}
