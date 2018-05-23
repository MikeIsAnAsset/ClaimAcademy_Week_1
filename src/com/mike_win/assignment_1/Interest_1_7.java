package com.mike_win.assignment_1;

import java.util.Scanner;

public class Interest_1_7 {



	public static void main(String[] args) {
		// Declare and define input
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the investment amount: ");
		double investment = in.nextDouble();
		
		System.out.print("Enter the monthly interest rate: ");
		double monthlyInterestRate = in.nextDouble();
		
		System.out.print("Enter the number of years: ");
		int years = in.nextInt();
		
		// Print output to console by calling function
		System.out.printf("The simple interest accumulated\r" + 
				"on a principal of $ " + investment + "\n" + 
				"at a monthly interest rate of " + monthlyInterestRate + "\n" + 
				"for " + years + " years is $ " + "%.2f", calculateInterest(investment, monthlyInterestRate, years));
	}

	// Declare and define function
	private static double calculateInterest(double investment, double monthlyInterestRate, int years) {
		// Convert monthly interest rate percentage to decimal
		monthlyInterestRate = monthlyInterestRate / 100;
		
		// Calculate yearly interest rate
		double yearlyInterestRate = monthlyInterestRate * 12;
		
		// Calculate simple interest:  I=Prt
		//double yearlyInterest = Math.round((investment * yearlyInterestRate * years) * 100d / 100d);
		double yearlyInterest = (investment * yearlyInterestRate * years);
		return yearlyInterest;
		
		
	}
}