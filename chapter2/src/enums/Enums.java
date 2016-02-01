package enums;

public class Enums {
	
	public static void printSomethingBasedOnTheDay(Day day) {
		if (day == Day.MONDAY) {
			System.out.println("Everyone hates Mondays.");
		} else if (day == Day.FRIDAY) {
			System.out.println("It's almost weekend, wohoo!.");
		} else if (day == Day.SATURDAY || day == Day.SUNDAY) {
			System.out.println("Party time!");
		} else {
			System.out.println("Midweek days are not so great.");
		}
	}
	
	public static void main(String[] args) {
		printSomethingBasedOnTheDay(Day.MONDAY);
		printSomethingBasedOnTheDay(Day.TUESDAY);
		printSomethingBasedOnTheDay(Day.WEDNESDAY);
		printSomethingBasedOnTheDay(Day.THURSDAY);
		printSomethingBasedOnTheDay(Day.FRIDAY);
		printSomethingBasedOnTheDay(Day.SATURDAY);
		printSomethingBasedOnTheDay(Day.SUNDAY);
	}
}