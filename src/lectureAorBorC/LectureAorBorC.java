package lectureAorBorC;

import java.util.Scanner;

public class LectureAorBorC {

	public static void main(String[] args) {
		// Get user input, declare and define variables
		Scanner input = new Scanner(System.in);
		
/*		System.out.print("Give a value for a: ");
		int a = input.nextInt();
		
		System.out.print("Give a value for b: ");
		int b = input.nextInt();
		
		System.out.print("Give a value for c: ");
		int c = input.nextInt();*/
		
		System.out.print("Give a value for character: ");
		String letter = input.next();		
		char character = letter.charAt(0);
		
		System.out.print("Give a value for word: ");
		String word = input.next();
		
		// Call function
		// printMax(a, b, c);
		// printMax(a, b, c);
		// calculateMedian(a, b, c);
		remove(character, word);
	}
	
	// Declare and define method
	public static void printMax(int a, int b, int c) {
	// public static void printMax() {
		int count = 0;
		int greatestNum;
		
		//do {
/*		// Get user input, declare and define variables
		System.out.print("Give a value for a: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		
		System.out.print("Give a value for b: ");
		int b = input.nextInt();
		
		System.out.print("Give a value for c: ");
		int c = input.nextInt();*/
		
		int greaterNum;
		
		if (a > b) {
			greaterNum = a;
		} else {
			greaterNum = b;
		}
		
		if (greaterNum > c) {
			greatestNum = greaterNum;
		} else {
			greatestNum = c;
		}
		
		System.out.println(greatestNum);
		
		//} while (count == 0);
		
	}
	
	public static void calculateMedian(int a, int b, int c) {
		if (a > b && a < c) {
			System.out.println(a);
		} else if (b > a && b < c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
	
	public static void calculateMin(int a, int b, int c) {
		if (a < b || a < c) {
			System.out.println(a);
		} else if (b < a || b < c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
	
	
	public static void remove(char ch, String word) {
		
		
		String newWord = "";
		
		for (int i =0; i < word.length(); i++) {
			if (word.charAt(i) != ch) {
				newWord += word.charAt(i);
			}
		}
		
		
/*		do {
		int charIndex = word.indexOf(ch);
		String front = word.substring(0, charIndex);
		String back = word.substring(charIndex+1);
		newWord = front + back;
		} while (newWord.indexOf(ch) != -1); */
		
		System.out.println(newWord);
	}
	
}