package Carriers;

public class Transport {
	protected boolean cargo;
	protected String departurePlace;
	protected String destination;
	protected int transportID;
	
	Transport(boolean cargo, String departurePlace, String destination, int transportID){
		this.cargo = cargo;
		this.departurePlace = departurePlace;
		this.destination = destination;
		this.transportID = transportID;
	}
	
	int setTrainNumber() {
		return 0;
	}
}
