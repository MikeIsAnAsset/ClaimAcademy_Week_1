package com.mike_win.assignment_3;

public class Loops_5 {

	public static void main(String[] args) {
		// Declare and define variables
		int num = 4;
		
		// Invoke method
		makeRectangle(num);

	}

	private static void makeRectangle(int num) {
		for (int i = 0; i<num-1; i++) {
			for (int j = 0; j<num; j++) {
				System.out.print(i+1);
			}
		System.out.println("");
		}
	}

}
