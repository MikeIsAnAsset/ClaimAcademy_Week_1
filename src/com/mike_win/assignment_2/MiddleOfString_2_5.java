package com.mike_win.assignment_2;

import java.util.Scanner;

public class MiddleOfString_2_5 {

	public static void main(String[] args) {
		// Get input; Declare and define variables
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a string: ");
		String string = in.nextLine();
		
		
		
		// Print to console result of calling method
		System.out.println(newString(string));
	}
	//	Declare and define method

	private static String newString(String string) {
		String newWord = "";
		
		if (string.length() % 2 == 0) {
			int firstIndexToRemove = string.length() / 2;
			String firstNewSubString = string.substring(0, firstIndexToRemove-1);
			String lastNewSubString = string.substring(firstIndexToRemove+1);
			newWord = firstNewSubString + lastNewSubString;
		} else {
			int indexToRemove = (string.length() - 1) / 2;
			String firstNewSubString = string.substring(0, indexToRemove);
			String lastNewSubString = string.substring(indexToRemove+1);
			newWord = firstNewSubString + lastNewSubString;
		}
		return newWord;
	}
	
}
