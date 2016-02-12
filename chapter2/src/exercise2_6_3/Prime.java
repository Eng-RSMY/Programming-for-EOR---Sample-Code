package exercise2_6_3;

public class Prime {
	
	public static void main(String[] args){
		System.out.println("The are the primes between 1 and 250:");
		for(int index = 1; index < 250; index++){
			if ( isPrime(index) ){
				System.out.print(index + " ");
			}
			//System.err.print(index + " ");
		}
		System.out.println();
	}

	static boolean isPrime(int candidate){
		boolean isPrime = true;
		for (int divisor = 2; divisor < candidate; divisor++){
			if ( candidate % divisor == 0 ) { //divisor is a divisor for candidate
				isPrime = false;
			}
		}
		return isPrime;
	}
}
