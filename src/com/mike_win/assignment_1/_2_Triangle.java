package com.mike_win.assignment_1;

import java.util.Scanner;

public class _2_Triangle {

	public static void main(String[] args) {
		// Get user input, declare & define variables
		System.out.print("Enter the triangle's base-width: ");
		Scanner input = new Scanner(System.in);
		double base = input.nextDouble();
		//input.next();
		System.out.print("Enter the height: ");
		double height = input.nextDouble();
		
		// Call functions
		calculateArea(base, height);

	}
	// Define area function
	private static void calculateArea(double base, double height) {
		double area = base * height / 2;
		System.out.println("The area of the triangle is " + area);
	}
}