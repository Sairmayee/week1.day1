package week1.day1;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		for (int range = 2; range < 8; range++) {
			int sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			num2 = sum;

		}
	}
}
