package com.mike_win.assignment_3;

public class Loops_6 {

	public static void main(String[] args) {
		// Declare and define variables
		int num = 4;
		
		// Invoke method
		makeRectangle(num);

	}

	private static void makeRectangle(int num) {
		for (int i = 1; i<num+1; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(i);		
			}
			System.out.println("\n");
		}
	}
}
