package com.mike_win.assignment_1;

import java.util.Scanner;

public class _1_CircleAreaAndCircumference {

	public static void main(String[] args) {
		// Declare & define variables
		// Get user input
		System.out.print("Enter the radius of the circle: ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		
		// Call function
		calculateArea(radius);
		calculateCircumference(radius);
	}
	// Define area function and parameters
	// Declare & define variables
	public static void calculateArea(double radius) {
		double area = Math.PI * (radius * radius);
		System.out.println("The area of the circle is " + area);
	}
	
	// Define circumference function and parameters
	// Declare & define variables
	public static void calculateCircumference(double radius) {
		double circumference = 2 * Math.PI * radius;
		System.out.print("The circumference of the circle is " + circumference);
	}
}
