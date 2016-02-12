package exercise1_6_4;

public class Change {

	public static void main(String[] args) {
		double amountToBePaid = 1043.22;
		double amountPaid = 1800d;
		double totalChange;

		int euros, cents;

		totalChange = amountPaid - amountToBePaid;
		euros = (int) totalChange;
		cents = (int) (totalChange * 100) - (euros * 100);

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (500 euro bills) = " + euros / 500);
		euros = euros % 500;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (200 euro bills) =  " + euros / 500);
		euros = euros % 200;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (100 euro bills)  = " + euros / 200);
		euros = euros % 100;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (50 euro bills) =  " + euros / 50);
		euros = euros % 50;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (20 euro bills) =  " + euros / 20);
		euros = euros % 20;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (10 euro bills) =  " + euros / 10);
		euros = euros % 10;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (5 euro bills) =  " + euros / 5);
		euros = euros % 5;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (2 euro coins) = " + euros / 2);
		euros = euros % 2;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (1 euro coins) = " + euros);

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (50 cent coins) =  " + cents / 50);
		cents = cents % 50;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (20 cent coins) =  " + cents / 20);
		cents = cents % 20;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (10 cent coins) = " + cents / 10);
		cents = cents % 10;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (5 cent coins) = " + cents / 5);
		cents = cents % 5;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (2 cent coins) = " + cents / 2);
		cents = cents % 2;

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);

		System.out.println(" (1 cent coins) = " + cents);

		System.out.println("Change: " + totalChange + " Euro's: " + euros + " Cents: " + cents);
	}

}
