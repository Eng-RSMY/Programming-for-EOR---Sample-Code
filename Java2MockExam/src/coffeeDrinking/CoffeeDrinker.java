package coffeeDrinking;

public class CoffeeDrinker {
	private String name;

	public CoffeeDrinker(String name) {
		this.name = name;
	}

	public CoffeeCup takesCleanCupFrom(CoffeeCup[] cups) {
		for ( CoffeeCup cup : cups ){
			if ( cup.isClean() ){
				return cup;
			}
		}
		cleanCups(cups);
		return takesCleanCupFrom(cups);
	}
	
	private void cleanCups(CoffeeCup[] cups){
		for ( CoffeeCup cup : cups ){
			cup.clean();
		}
	}

	public void drinks(CoffeeCup cup) {
		System.out.println("I, " + name + " just finished a nice " + cup.getType() + " from cup number: " + cup.getCupNumber() + ".");
	}

}
