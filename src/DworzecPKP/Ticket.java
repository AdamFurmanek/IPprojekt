package DworzecPKP;

public class Ticket {

	protected TicketType type;
	protected Cashier seller;
	protected Transport transport;
	
	Ticket(TicketType type, Cashier seller, Transport transport){
		this.type = type;
		this.seller = seller;
		this.transport = transport;
	}
}
