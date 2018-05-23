package methods;

public class Methods_4 {

	public static void main(String[] args) {
		// Declare and define variables
		int temp = 90;
		boolean isSummer = false;
		
		// Call methods 
		System.out.println(squirrelPlay(temp, isSummer));
	}

	private static boolean squirrelPlay(int temp, boolean isSummer) {
		// Declare and define variable
		int upperLimit = 90;
		
		// Check if summer
		if (isSummer) 
			upperLimit = 100;
		
		
		if (temp >= 60 && temp <= upperLimit) {
			return true;
		} else {
			return false;
		}
	}
}
