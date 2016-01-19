package oneClassOnly;

import java.util.Scanner;

public class PrimeNumbersStupid {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("please type an integer number (n > 1 && n < 100) = ");
		int numberOne = reader.nextInt();
		System.out.println("the number you have inputted is = " + numberOne);

		int counter = 2;
		boolean isItPrime = true;
		while (counter <= numberOne / 2) {
			if (numberOne % counter == 0) {
				isItPrime = false;
			}
			counter++;
		}
		if (!isItPrime) {
			System.out.println("the first number: " + numberOne
					+ " is Not Prime.");
		} else {
			System.out
					.println("the first number: " + numberOne + " is Prime. ");
		}
		// and we could write almost the same code again!
		System.out
				.print("please type another integer number (n > 1 && n < 100) = ");
		int numberTwo = reader.nextInt();
		System.out.println("the number you have inputted is = " + numberTwo);

		counter = 2;
		isItPrime = true;
		while (counter <= numberTwo / 2) {
			if (numberTwo % counter == 0) {
				isItPrime = false;
			}
			counter++;
		}
		if (!isItPrime) {
			System.out.println("Number: " + numberTwo + " is Not Prime.");
		} else {
			System.out.println("Number: " + numberTwo + " is Prime. ");
		}
		reader.close();
	}

}
