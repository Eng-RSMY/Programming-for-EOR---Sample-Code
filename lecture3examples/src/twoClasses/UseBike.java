package twoClasses;

public class UseBike {

	public static void main(String[] args) {
		Bicycle myBike = new Bicycle(0.5, 3); 
		// cadence is half a stroke per second, gear ratio is 3m / full pedal circle

		myBike.setCadence(1.5);
		System.out.println("current speed is = " + myBike.speed() + " m/s");

		myBike.setGear(5.5);
		System.out.println("current speed is = " + myBike.speed() + " m/s");

		myBike.applyBrake(myBike.speed() - myBike.speed() / 2);
		System.out.println("current speed is = " + myBike.speed() + " m/s");
		System.out.println("and my new cadence after braking is = " + myBike.cadence + " pedal strokes/s");

	}

}
