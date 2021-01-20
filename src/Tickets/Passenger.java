package Tickets;

import TimeTables.Route;

public class Passenger {

	protected String firstName;
	protected String finalName;
	protected String telephone;
	protected String email;
	
	Passenger(String firstName, String finalName, String telephone, String email){
		this.firstName = firstName;
		this.finalName = finalName;
		this.telephone = telephone;
		this.email = email;
	}
	
	public Ticket buyTicket(Route route, String type) {
		if(type=="first") {
			return new FirstClassStrategy().buyTicket(route, this);
		}
		else if(type=="second") {
			return new SecondClassStrategy().buyTicket(route, this);
		}
		else
			throw new IllegalArgumentException("Bad type of ticket.");
	}
}
