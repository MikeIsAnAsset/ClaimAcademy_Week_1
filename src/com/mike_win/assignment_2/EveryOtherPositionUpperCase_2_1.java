package com.mike_win.assignment_2;

import java.util.Scanner;

public class EveryOtherPositionUpperCase_2_1 {

	public static void main(String[] args) {
		// Get input; Declare and define variables
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your word: ");
		String word = in.nextLine();
		
		// Print to console by calling function
		System.out.print("Your new word is: " + convertWord(word));

	}
	// Declare and define function to convert character case in word
	private static String convertWord(String word) {
		// Declare and initialize local variables
		String newWord = "";
		
		for (int i = 0; i < word.length(); i++){
			if (i % 2 == 0) {
/*				newWord += word.charAt(i); 
				newWord.toLowerCase();*/
				newWord += ((String) word.subSequence(i, i+1)).toLowerCase();
				
			} else {
				newWord += ((String) word.subSequence(i, i+1)).toUpperCase();
				
				//char upperChar = word.charAt(i);
				//(String) upperChar.toUpperCase();
				
				// newWord += upperChar;
			}
		}
		return newWord;
	}
}
