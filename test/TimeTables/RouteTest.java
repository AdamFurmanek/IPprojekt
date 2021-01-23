package TimeTables;

import java.util.Date;

import org.junit.Test;

import Carriers.Carrier;
import WorkSchedules.Task;
import junit.framework.Assert;

public class RouteTest {

	@Test
	//Sprawdza poprawnoœæ konstruktora i getterów.
	public void checkConstructorAndGetters(){
		
		Carrier carrier = new Carrier("Intercity");
		
		Route route = new Route(carrier, "¯eromski", new Date(2020,1,1), "Peron 3", 21);
					
		Assert.assertEquals(carrier, route.getCarrier());
		Assert.assertEquals("¯eromski", route.getTrainName());
		Assert.assertEquals(new Date(2020,1,1), route.getDate());
		Assert.assertEquals("Peron 3", route.getPlatform());
		Assert.assertEquals(21, route.getNumberOfStations());
	}
}
