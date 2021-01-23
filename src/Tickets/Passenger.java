package Tickets;

import TimeTables.Route;

public class Passenger {

	protected String firstName;
	protected String finalName;
	protected String telephone;
	protected String email;
	
	public Passenger(String firstName, String finalName, String telephone, String email){
		if(firstName==null)
			throw new IllegalArgumentException("firstName can not be null.");
		if(finalName==null)
			throw new IllegalArgumentException("finalName can not be null.");
		if(telephone==null)
			throw new IllegalArgumentException("telephone can not be null.");
		if(email==null)
			throw new IllegalArgumentException("email can not be null.");
		
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
	
	public String getfirstName() {
		return firstName;
	}
	
	public String getfinalName() {
		return finalName;
	}
	
	public String getTelephone() {
		return telephone;
	}
	
	public String getEmail() {
		return email;
	}
}
