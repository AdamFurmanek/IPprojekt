package Tickets;

import TimeTables.Route;

public class Ticket {

	private Passenger passenger;
	private Route route;
	private String type;
	private double price;
	
	public Ticket(Passenger passenger, Route route, String type, double price) {
		this.passenger = passenger;
		this.route = route;
		this.type = type;
		this.price = price;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public Route getRoute() {
		return route;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

}
