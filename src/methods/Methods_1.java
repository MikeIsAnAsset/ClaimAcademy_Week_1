package methods;

public class Methods_1 {

	public static void main(String[] args) {
		// Declare and define variables
		String string = "Hi";
		int num = 2;
		
		// Invoke method
		System.out.println(stringTimes(string, num)); 

	}

	private static String stringTimes(String string, int num) {
		String newString = "";
		for (int i =0; i < num; i++) {
			newString += string;
		}
		return newString;
	}

}
