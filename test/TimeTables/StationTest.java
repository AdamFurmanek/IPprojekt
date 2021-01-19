package TimeTables;

import java.util.Date;

import org.junit.Test;

import WorkSchedules.WorkSchedule;
import junit.framework.Assert;

public class StationTest {

	@Test
	public void checkConstructorAndGetters(){
		Station station = new Station("Warszawa centrum",new Date(2020,04,21,15,30));
		Assert.assertEquals("Warszawa centrum",station.getStationName());
		Assert.assertEquals(new Date(2020,04,21,15,30),station.getDate());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nullStation() {
		Station station = new Station(null,new Date(2020,04,21,15,30));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void nullDate() {
		Station station = new Station("Warszawa centrum",null);
	}
}
