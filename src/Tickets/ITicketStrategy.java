package Tickets;

import TimeTables.Route;

public interface ITicketStrategy {

	public Ticket buyTicket(Route route, Passenger passenger);
}
