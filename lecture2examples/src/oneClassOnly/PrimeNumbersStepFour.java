package oneClassOnly;

import java.util.Scanner;

public class PrimeNumbersStepFour {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("the upper limit (<9999) = ");
		int limit = scan.nextInt();
		for (int i = 2; i < limit; i++) {
			if (isPrimeNumber(i)) {
				System.out.println("Number: " + i + " is a Prime.");
			}
		}
		scan.close();
	}

	/*
	 * Returns if the argument is prime or not
	 */
	static boolean isPrimeNumber(int number) {
		int counter = 2;
		boolean isItPrime = true;
		while (counter <= number / 2) {
			if (number % counter == 0) {
				isItPrime = false;
			}
			counter++;
		}
		return isItPrime;
	}
}
