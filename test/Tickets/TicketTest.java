package Tickets;

import java.util.ArrayList;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import Carriers.Carrier;
import TimeTables.Route;
import WorkSchedules.Task;
import junit.framework.Assert;

public class TicketTest {
	
	Passenger passenger;
	Carrier carrier;
	Route route;
	
	@Before
    public void setUp() {
		passenger = new Passenger("Bogdan","Wenta","+48557687563","bogdan.wenta@poczta.eu");
		carrier = new Carrier("Cargo");
		route = new Route(carrier,"¯eromski",new Date(2020,04,20,15,30),"peron 7",5);
    }
	//Sprawdza poprawnoœæ konstruktora i getterów.
	@Test
	public void checkConstructorAndGetters() {
		Ticket ticket = new Ticket (passenger,route,"towarowy",23.50);
		Assert.assertEquals(passenger, ticket.getPassenger());
		Assert.assertEquals(route, ticket.getRoute());
		Assert.assertEquals("towarowy", ticket.getType());
		Assert.assertEquals(23.50, ticket.getPrice(), 23.50);
	}
	
	
	//Sprawdza wyj¹tek jeœli firstName to null.
	@Test(expected = IllegalArgumentException.class)
	public void nullType() {
		Ticket ticket = new Ticket (passenger,route,null,23.50);
	}
	
	//Sprawdza wyj¹tek jeœli finalName to null.
	@Test(expected = IllegalArgumentException.class)
	public void checkPrice() {
		Ticket ticket = new Ticket (passenger,route,"towarowy",0);
			}
	
	}