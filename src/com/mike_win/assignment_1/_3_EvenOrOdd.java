package com.mike_win.assignment_1;

import java.util.Scanner;

public class _3_EvenOrOdd {

	public static void main(String[] args) {
		// Get user input, declare & define variables
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int integer = input.nextInt();
		
		// Call function
		checkOddOrEven(integer);
	}

	private static void checkOddOrEven(int integer) {
		if (integer % 2 == 0) {
			System.out.print("This number is EVEN");
		} else {
			System.out.print("This number is ODD");
		}
		
	}

}
