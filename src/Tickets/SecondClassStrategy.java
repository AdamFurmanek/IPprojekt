package Tickets;

import TimeTables.Route;

public class SecondClassStrategy implements ITicketStrategy{

	@Override
	public Ticket buyTicket(Route route, Passenger passenger) {
		return new Ticket(passenger,route,"Second Class", 50);
	}

}
