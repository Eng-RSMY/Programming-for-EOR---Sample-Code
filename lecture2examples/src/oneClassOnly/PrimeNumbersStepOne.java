package oneClassOnly;

import java.util.Scanner;

public class PrimeNumbersStepOne {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		
		System.out.print("please type an integer number (n > 1 && n < 100) = ");
		int numberOne = reader.nextInt();
		System.out.println("the number you have inputted is = " + numberOne);
		
		reader.close();
	}

}
