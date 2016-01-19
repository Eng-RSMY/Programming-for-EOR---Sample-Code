package oneClassOnly;

public class PrimeNumbersStepThree {

	public static void main(String[] args) {
		checkForPrimeNumber(27);
		checkForPrimeNumber(37);
		checkForPrimeNumber(57);
		checkForPrimeNumber(79);
	}

	static void checkForPrimeNumber(int number) {
		int counter = 2;
		boolean isItPrime = true;
		while (counter <= number / 2) {
			if (number % counter == 0) {
				isItPrime = false;
			}
			counter++;
		}
		if (!isItPrime) {
			System.out.println("Number: " + number + " is Not Prime.");
		} else {
			System.out.println("Number: " + number + " is Prime. ");
		}
	}
}
