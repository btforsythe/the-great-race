package race;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolarPoweredCarTest {

	@Test
	public void shouldHaveRangeLimitedByMaintenance() {
		int topSpeedMph = 70;
		int maintenanceIntervalMiles = 500;
		Vehicle underTest = new SolarPoweredCar(topSpeedMph, maintenanceIntervalMiles);
		
		assertEquals(500, underTest.range());
	}
	
	@Test
	public void shouldKnowTopSpeedWhenLimitIsHigher() {
		int topSpeed = 45;
		Vehicle underTest = new SolarPoweredCar(topSpeed, -1);
		int speedLimit = 60;
	
		int speed = underTest.maxSpeed(speedLimit);
		
		assertEquals(45, speed);
	}
}
