package com.mike_win.assignment_3;

public class Loops_1 {

	public static void main(String[] args) {
		// Declare and define variables
		int numRows = 3;

		// Call method
		makeRectangle(numRows);
	}

	private static void makeRectangle(int numRows) {
		for (int i = 0; i < numRows; i++) {
			System.out.println("*****\n");
		}
		
	}

}
