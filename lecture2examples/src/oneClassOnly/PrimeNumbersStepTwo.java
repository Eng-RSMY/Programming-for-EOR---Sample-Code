package oneClassOnly;

import java.util.Scanner;

public class PrimeNumbersStepTwo {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		System.out.print("please type an integer number (n > 1 && n < 100) = ");
		int numberOne = reader.nextInt();
		System.out.println("the number you have inputted is = " + numberOne);

		// testing new if variable numberOne contains a value that is a prime
		// number
		int counter = 2;
		boolean isItPrime = true;

		while (counter <= numberOne / 2) // start a loop, during loop the
											// counter variable will become each
											// number between 2 and
		{ // the entered number divided by 2
			if (numberOne % counter == 0) // If their is no remainder from your
											// number divided by counter...
			{
				isItPrime = false; // Then isItPrime is set to false as the
									// number divides equally by another number,
									// hence
			} // it is not a prime number
			counter++; // Increment counter to the next number to test against
						// the number you entered
		}
		if (!isItPrime) // check the boolean variable isItPrime after the loop
		{
			System.out.println("Number: " + numberOne + " is Not Prime.");
		} else {
			System.out.println("Number: " + numberOne + " is Prime. ");
		}
		reader.close();
	}
}
