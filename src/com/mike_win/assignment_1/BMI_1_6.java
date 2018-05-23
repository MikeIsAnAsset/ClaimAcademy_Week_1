package com.mike_win.assignment_1;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class BMI_1_6 {

	public static void main(String[] args) {
		// Declare and define variables
		Scanner in = new Scanner(System.in);
		
		// Get height and weight from user
		System.out.print("Enter weight in pounds: ");
		double weight = in.nextDouble();
		
		System.out.print("Enter height in inches: ");
		double inchesHeight = in.nextDouble();
		
		// Call function
		calculateBMI(inchesHeight, weight);
	}
	// Declare and define function
	public static void calculateBMI(double height, double weight) {
		double feetHeight = height / 12;
		double BMI = (double)Math.round(((weight / (height * height)) * 703) ) / 10000;
		System.out.print("BMI is " + BMI);
	}
	// Declare and define rounding function
/*	static double round(double BMI) {

		DecimalFormat df = new DecimalFormat(#".####");
		df.setRoundingMode(RoundingMode.HALF_UP);
		double roundedBMI = df.format(doubleValue(BMI));
		return roundedBMI;
	}*/
}
