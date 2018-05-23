package com.mike_win.assignment_2;

public class LargestArrayElement_2_6 {

	public static void main(String[] args) {
		// Declare and define array
		int[] myList = {5, 3, 2, 9, 7, 8, 1, 0};
		
		// Print largest element by calling method
		System.out.println("The largest element is: " + findLargestElement(myList));
	}
	// Declare and define method
	private static int findLargestElement(int[] myList) {
		int largestElement = 0;
		
		for (int i: myList) {
			if (i > largestElement) {
				largestElement = i;
			}
		}
		return largestElement;
	}
	
}
