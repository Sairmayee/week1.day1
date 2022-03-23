package week1.day1;

public class Factorial {
	public static void main(String[] args) {
		//		int fact = 1;
		//		int value = 5;
		//		for (int input = 1; input <= value; input++) {
		//			fact = fact*input;
		//		}
		//	System.out.println(fact);

		int input;
		int fact = 1;
		for (input = 5 ; input > 0 ; input-- ) {
			fact = fact * input;
		}
		System.out.println("Factorial is " + fact);
	}
}
