package com.mike_win.assignment_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class _5_DoubleToWhole {

	public static void main(String[] args) {
		// Declare & define variables
		
		// Call function
		convertDoubleToWhole();
	}
	// Define function
	// Get double from user
	// Convert double to whole
	public static void convertDoubleToWhole() {
		int count = 0;
		do {
			//DecimalFormat df2 = new DecimalFormat(".");
			System.out.print("Enter your double :");
			Scanner input = new Scanner(System.in);
			double inputStorage = input.nextDouble();
			//String whole = df2.format(input.nextDouble());
			//int whole = (int) input.nextDouble();
			int whole = (int) Math.round(input.nextDouble());
			System.out.println("You entered " + inputStorage + ", the whole number is " + whole);
		} while (count == 0);

		
	}
}
