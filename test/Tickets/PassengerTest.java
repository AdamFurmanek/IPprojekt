package Tickets;

import org.junit.Test;

import junit.framework.Assert;

public class PassengerTest {
	
	//Sprawdza poprawno�� konstruktora i getter�w.
	@Test
	public void checkConstructorAndGetters() {
		Passenger passenger = new Passenger ("Jan","Kowalski","+48997453687","jan.kowalski@poczta.pl");
		Assert.assertEquals("Jan", passenger.getfirstName());
		Assert.assertEquals("Kowalski", passenger.getfinalName());
		Assert.assertEquals("+48997453687", passenger.getTelephone());
		Assert.assertEquals("jan.kowalski@poczta.pl", passenger.getEmail());
	}
	
	
	//Sprawdza wyj�tek je�li firstName to null.
	@Test(expected = IllegalArgumentException.class)
	public void nullfirstName() {
		Passenger passenger = new Passenger (null,"Kowalski","+48997453687","jan.kowalski@poczta.pl");
	}
	
	//Sprawdza wyj�tek je�li finalName to null.
	@Test(expected = IllegalArgumentException.class)
	public void nullfinalName() {
		Passenger passenger = new Passenger ("Jan",null,"+48997453687","jan.kowalski@poczta.pl");
			}
			
	//Sprawdza wyj�tek je�li telephone to null.
	@Test(expected = IllegalArgumentException.class)
	public void nullTelephone() {
		Passenger passenger = new Passenger ("Jan","Kowalski",null,"jan.kowalski@poczta.pl");
			}

	//Sprawdza wyj�tek je�li email to null.
	@Test(expected = IllegalArgumentException.class)
	public void nullEmail() {
		Passenger passenger = new Passenger ("Jan","Kowalski","+48997453687",null);
			}
	
	}
