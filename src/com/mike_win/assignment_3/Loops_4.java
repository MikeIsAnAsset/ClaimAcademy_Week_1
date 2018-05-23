package com.mike_win.assignment_3;

public class Loops_4 {

	public static void main(String[] args) {
		// Declare and define variables
		int num = 5;
		
		// Invoke method
		makeRectangle(num);

	}

	private static void makeRectangle(int num) {
		for (int i = 0; i<num; i++) {
			for (int j = 0; j<num; j++) {
				int count = 1;
				count += j;
				System.out.print(count + " ");
			}
		System.out.println("");
		}
	}

}
