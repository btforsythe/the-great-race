package race;

public class Automobile extends Vehicle {

	private int fuelEconomyMpg;
	private int tankCapacityG;

	public Automobile(int fuelEconomyMpg, int tankCapacityG, int topSpeedMph) {
		super(topSpeedMph);
		this.fuelEconomyMpg = fuelEconomyMpg;
		this.tankCapacityG = tankCapacityG;
	}

	@Override
	public int range() {
		return fuelEconomyMpg * tankCapacityG;
	}

}
