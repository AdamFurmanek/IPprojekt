package DworzecPKP;

import java.util.List;

public class Passenger {

	protected String firstName;
	protected String finalName;
	protected long telephone;
	protected String email;
	protected List<Ticket> myTickets;
	
	Passenger(String firstName, String finalName, long telephone, String email, List<Ticket> myTickets){
		this.firstName = firstName;
		this.finalName = finalName;
		this.telephone = telephone;
		this.email = email;
		this.myTickets = myTickets;
	}
}
