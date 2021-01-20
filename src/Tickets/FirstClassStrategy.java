package Tickets;

import TimeTables.Route;

public class FirstClassStrategy implements ITicketStrategy{

	@Override
	public Ticket buyTicket(Route route, Passenger passenger) {
		return new Ticket(passenger,route,"First Class", 100);
	}

}
