package twoClasses;

public class Bicycle {

	// the Bicycle class has
	// two fields or attributes
	public double cadence;
	public double gearRatio;

	// the Bicycle class has a special method
	// The constructor
	public Bicycle(double startCadence, double startGearRatio) {
		gearRatio = startGearRatio;
		cadence = startCadence;
	}

	// the Bicycle class has
	// four methods
	public void setCadence(double newValue) {
		cadence = newValue;
	}

	public void setGear(double ratioValue) {
		gearRatio = ratioValue;
	}

	public double speed() {
		return cadence * gearRatio;
	}

	public void applyBrake(double decrement) {
		double lowerSpeed = speed() - decrement;
		setCadence(lowerSpeed / gearRatio);
	}
}
