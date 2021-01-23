package Tickets;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import Carriers.Carrier;
import TimeTables.Route;
import junit.framework.Assert;

public class SecondClassStrategyTest {
	
	Passenger passenger;
	Carrier carrier;
	Route route;
	
	@Before
    public void setUp() {
		 passenger = new Passenger("Bogdan","Wenta","+48557687563","bogdan.wenta@poczta.eu");
		 carrier = new Carrier("Cargo");
		 route= new Route(carrier,"¯eromski",new Date(2020,04,20,15,30),"peron 7",5);
	}
	@Test
	public void checkBuyTicket() {
		
		Ticket ticket = new SecondClassStrategy().buyTicket(route, passenger);
		
		Assert.assertEquals(route, ticket.getRoute());
		Assert.assertEquals(passenger, ticket.getPassenger());
		
	}
}
