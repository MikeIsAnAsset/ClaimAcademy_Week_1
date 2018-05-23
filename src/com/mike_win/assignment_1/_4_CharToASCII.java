package com.mike_win.assignment_1;

import java.util.Scanner;

public class _4_CharToASCII {

	public static void main(String[] args) {
		// Declare & define variables
		
		
		// Call function
		convertChar();
	}
	// Define function
	// Get user input
	// Convert input to ASCII
	public static void convertChar(){
		int count = 0;
		do {
			System.out.println("Enter a letter of the alphabet: ");
			Scanner input = new Scanner(System.in);
			char character = input.next().charAt(0);
			int ASCII = (int) character;
			System.out.println("The numerical ASCII value for " + character + " is " + ASCII);
		} while (count == 0);
			
		
		
		
	}

}
