package week1.day1;

public class Factorial {
	public static void main(String[] args) {
		int fact = 1;
		int value = 5;
		for (int input = 1; input <= value; input++) {
			fact = fact*input;
		}
	System.out.println(fact);
}
}
