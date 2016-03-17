package coffeeDrinking;

public class CoffeeMachine {
	private int capacity;
	private CoffeeType type;
	
	public CoffeeMachine(CoffeeType type, int capacity) {
		this.capacity = capacity;
		this.type = type;
	}
	
	public CoffeeType pouringCoffeeIntoCup(){
		if ( capacity <= 0 ){
			System.err.println("pouring from empty machine");
			return null;
		} else {
			capacity--;
			return type;
		}
	}
	
	public boolean isEmpty(){
		return capacity <= 0;
	}

}
