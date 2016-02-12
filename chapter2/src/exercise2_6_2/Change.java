package exercise2_6_2;

import java.util.Scanner;

public class Change {
	public static void main(String[] args){
		
		Scanner keyboard = new Scanner(System.in);
		
		boolean keepGoing = true;
		int[] denominations = {500,200,100,50,20,10,5,2,1};
		
		while ( keepGoing ){
			System.out.println("What amount did the customer pay with?");
			int amountPaidWith = keyboard.nextInt();
			System.out.println("What amount should he have paid?");
			int amountToPay = keyboard.nextInt();
			int change = amountPaidWith - amountToPay;
			
			if ( change < 0 ) {
				keepGoing  = false;
				System.err.println("The customer did not pay enough");
				System.err.println("Halting program");
			} else {
				for(int index = 0; index < denominations.length; index++){
					change = numberOf(denominations[index], change);
				}
			}
			
		}
		keyboard.close();
	}
	
	static int numberOf(int denomination, int change){
		System.out.println("Give back " + change/denomination + " x " + denomination + " EUR");
		change = change%denomination;
		return change;
	}

}
