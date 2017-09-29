package race;

public abstract class Vehicle {

	protected int topSpeedMph;
	
	public Vehicle(int topSpeedMph) {
		this.topSpeedMph = topSpeedMph;
	}
	
	public abstract int range();

	public int maxSpeed(int speedLimit) {
		int virtualSpeedLimit = speedLimit + 10;
		if (topSpeedMph < virtualSpeedLimit) {
			return topSpeedMph;
		}
		return virtualSpeedLimit;
	}
}
