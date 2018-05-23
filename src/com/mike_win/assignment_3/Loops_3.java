package com.mike_win.assignment_3;

public class Loops_3 {

	public static void main(String[] args) {
		// Declare and define variables
		int numRows = 5;
		
		// Invoke method to create triangle
		createTriangle(numRows);
	}
	// Declare and define method

	private static void createTriangle(int numRows) {
		for (int i=0; i<numRows; i++){
            for (int j=numRows; j>i; j--)
            {    
                System.out.print("*");
            }
            System.out.println("\n");
		}
		
		
/*		char[] pattern = {'*', '*', '*', '*', '*'};
		for (int i = numRows; i < numRows; i--) {
			System.out.println(pattern[] -= pattern);
			System.out.println("\n");*/
		
		
	}
}
