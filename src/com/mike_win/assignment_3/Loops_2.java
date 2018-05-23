package com.mike_win.assignment_3;

public class Loops_2 {

	public static void main(String[] args) {
		// Declare and define variables
		int numRows = 4;
		
		// Invoke method to create triangle
		createTriangle(numRows);
	}
	// Declare and define method

	private static void createTriangle(int numRows) {
		String pattern = "";
		for (int i = 0; i < numRows; i++) {
			System.out.println(pattern += "*");
			System.out.println("\n");
		}
		
	}
}
