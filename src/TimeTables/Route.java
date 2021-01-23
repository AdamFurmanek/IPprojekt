package TimeTables;


import java.util.Date;

import Carriers.Carrier;

public class Route implements Comparable<Route> {

	private Carrier carrier;
	private String trainName;
	private Date date;
	private String platform;
	private int numberOfStations;
	
	public Route(Carrier carrier, String trainName, Date date, String platform, int numberOfStations) {
		this.carrier = carrier;
		this.trainName = trainName;
		this.date = date;
		this.platform = platform;
		this.numberOfStations = numberOfStations;
	}

	public Carrier getCarrier() {
		return carrier;
	}

	public String getTrainName() {
		return trainName;
	}

	public Date getDate() {
		return date;
	}

	public String getPlatform() {
		return platform;
	}
	
	public int getNumberOfStations() {
		return numberOfStations;
	}

	 public int compareTo(Route route){
		 int cmp = this.date.getTime() > route.date.getTime() ? +1 : this.date.getTime() < route.date.getTime() ? -1 : 0;
	     return cmp;
	 }
	
}
