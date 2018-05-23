package methods;

public class Methods_5 {

	public static void main(String[] args) {
		// Declare and define variables
		int a = 8;
		int b = 1;
		
		// Invoke methods and print result
		System.out.println(sumLimit(a, b));
	}
	
	// Declare and define method
	private static int sumLimit(int a, int b) {
		// Declare and define variables
		int sum = a + b;
		int lengthSum = String.valueOf(sum).length();
		int lengthA = String.valueOf(a).length();
		
		if (lengthSum > lengthA) {
			return a;
		} else {
			return sum;
		}
	}
}
