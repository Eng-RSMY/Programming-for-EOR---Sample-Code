package coffeeDrinking;

public class CoffeeTime {

	public static void main(String[] args) {
		// people invited to the coffee party are finishing the coffee in
		// machines
		// first, create the actors and the objects here
		TheCafe bar = new TheCafe();
		initialize(bar);
		// finish the coffee
		boolean coffeeAvailable = true;
		int drinkerIndex = 0;
		while (coffeeAvailable) {
			CoffeeDrinker drinker = bar.drinkers[drinkerIndex];
			CoffeeMachine machine = selectMachineFrom(bar.machines);

			if (machine != null) {
				CoffeeCup cup = drinker.takesCleanCupFrom(bar.cups);
				cup.filledFrom(machine);
				drinker.drinks(cup);
				drinkerIndex = (drinkerIndex + 1) % bar.drinkers.length;
				// start from the first drinker again
			} else {
				coffeeAvailable = false;
			}
		}
		System.out.println("...sorry, there is no coffee anymore");
	}

	private static CoffeeMachine selectMachineFrom(CoffeeMachine[] machines) {
		for ( CoffeeMachine machine : machines ){
			// If a machine contains coffee we can pour from it
			if ( !machine.isEmpty() ){
				return machine;
			}
		}
		return null;
	}

	private static void initialize(TheCafe bar) {
		bar.cups = new CoffeeCup[15];
		// Every cup is the same generate them automatically
		for ( int index = 0; index < bar.cups.length; index++){
			bar.cups[index] = new CoffeeCup();
		}
		
		bar.machines = new CoffeeMachine[4];
		// Machines based on the exercise
		bar.machines[0] = new CoffeeMachine(CoffeeType.FILTER, 5);
		bar.machines[1] = new CoffeeMachine(CoffeeType.ESPRESSO, 4);
		bar.machines[2] = new CoffeeMachine(CoffeeType.CAPPUCCINO, 5);
		bar.machines[3] = new CoffeeMachine(CoffeeType.LATTE, 7);

		bar.drinkers = new CoffeeDrinker[7];
		// Drinkers based on the example output
		bar.drinkers[0] = new CoffeeDrinker("John");
		bar.drinkers[1] = new CoffeeDrinker("Mary");
		bar.drinkers[2] = new CoffeeDrinker("James");
		bar.drinkers[3] = new CoffeeDrinker("Ellen");
		bar.drinkers[4] = new CoffeeDrinker("Nick");
		bar.drinkers[5] = new CoffeeDrinker("Chip");
		bar.drinkers[6] = new CoffeeDrinker("Anna");
		
	}

}
