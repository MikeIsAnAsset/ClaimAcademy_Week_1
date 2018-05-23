package methods;

public class Methods_3 {

	public static void main(String[] args) {
		// Declare and define variables
		String string = "xxxx";
		
		// Invoke method
		countXxInString(string);
	}

	// Declare and define method
	private static void countXxInString(String string) {
		// Declare and define variables
		int counter = 0;
		
		// Convert string to lowercase
		string.toLowerCase();
		
		// Loop through string and count number of "xx"
		for (int i=1; i<string.length(); i++) {

	/*		if (string.charAt(i) == string.charAt(string.length()-2)) {
				if (string.charAt(i) == string.charAt(string.length()-1)) {
					counter += 1;
				}*/
			if (string.charAt(i-1) == string.charAt(i)) {
				counter += 1;
			}
			
		}
		System.out.println(counter);
	}
}
