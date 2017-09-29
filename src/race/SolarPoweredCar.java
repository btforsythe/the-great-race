package race;

public class SolarPoweredCar extends Vehicle {

	private int maintenanceIntervalMiles;

	public SolarPoweredCar(int topSpeedMph, int maintenanceIntervalMiles) {
		super(topSpeedMph);
		this.maintenanceIntervalMiles = maintenanceIntervalMiles;
	}

	@Override
	public int range() {
		return maintenanceIntervalMiles;
	}
}
