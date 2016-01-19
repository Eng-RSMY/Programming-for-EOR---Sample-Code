package oneClassOnly;

public class CollectingFibonacciNumbers {
	static final int limit = 90;// this is a constant, try 99 and see what does it happen

	public static void main(String[] args) {
		long[] fibonacciNumbers = new long[limit + 1];// for exercise, try
														// without the +1
		for (int i = 0; i < limit; i++) {
			fibonacciNumbers[i] = fibonacciNumberOfOrder(i);
		}// we have all the numbers in the memory now
		for (int i = 0; i < limit; i++) {
			System.out.println("fibonacci(" + i + ") = "
					+ fibonacciNumbers[i]);
		}
	}

	public static long fibonacciNumberOfOrder(int number) {
		if (number == 0) {
			return 0;
		}
		if (number == 1 || number == 2) {
			return 1;
		}
		long firstNumber = 1;
		long secondNumber = 1;
		long fibonacciValueNumber = 1;
		for (int i = 3; i <= number; i++) {
			fibonacciValueNumber = firstNumber + secondNumber;
			firstNumber = secondNumber;
			secondNumber = fibonacciValueNumber;
		}
		return fibonacciValueNumber;
	}
}
