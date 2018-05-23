package methods;

public class Methods_2 {

	public static void main(String[] args) {
		// Declare and initialize variables
		int a = 2;
		int b = 1;
		int c = 2;
		
		// Invoke method
		greenTicket(a, b, c);
	}
	// Declare and define method
	private static void greenTicket(int a, int b, int c) {
		if (a != b && b != c && a != c) {
			System.out.println("0");
		} else if (a == b && b == c && a == c){
			System.out.println("20");
		} else if (a == b || b == c || a == c){
			System.out.println("10");
		}
		
		// 
	}
}
