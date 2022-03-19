package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) {
		int input = 13;
		boolean flag = false;
		for (int i =2; i<7; i++) {
			if (input % i != 0) {
				flag = true;
			}
		}
		if (flag  == true) {
			System.out.println("Prime");
		}
		else 
		{
			System.out.println("Not a Prime");
		}
	}
}
