package coffeeDrinking;

public class CoffeeCup {
	private static int numberOfCups = 0;
	
	private int cupNumber;
	private CoffeeType type;
	private boolean dirty = false;

	public CoffeeCup() {
		cupNumber = ++numberOfCups;
	}

	public void filledFrom(CoffeeMachine machine) {
		type = machine.pouringCoffeeIntoCup();
		dirty = true;
	}
	
	public void clean(){
		dirty = false;
	}
	
	public boolean isClean(){
		return !dirty;
	}
	
	public CoffeeType getType(){
		return type;
	}
	
	public int getCupNumber(){
		return cupNumber;
	}

}
