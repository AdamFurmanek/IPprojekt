package TimeTables;

import java.sql.Date;
import java.util.List;

import Carriers.Carrier;

public class Route implements Comparable<Route> {

	private Carrier carrier;
	private String trainName;
	private int numberOfCarriages;
	private Date date;
	private int delay; //podawane w minutach
	private String platform;
	private List<Station> stationChain;
	
	public Route(Carrier carrier, String trainName, int numberOfCarriages, Date date, int delay, String platform, List<Station> stationChain) {
		this.carrier = carrier;
		this.trainName = trainName;
		this.numberOfCarriages = numberOfCarriages;
		this.date = date;
		this.delay = delay;
		this.platform = platform;
		this.stationChain = stationChain;
	}

	public Carrier getCarrier() {
		return carrier;
	}

	public String getTrainName() {
		return trainName;
	}

	public int getNumberOfCarriages() {
		return numberOfCarriages;
	}

	public Date getDate() {
		return date;
	}

	public int getDelay() {
		return delay;
	}

	public String getPlatform() {
		return platform;
	}

	public List<Station> getStationChain() {
		return stationChain;
	}

	 public int compareTo(Route route){
		 long date1 = this.date.getTime()+this.delay*60000;
		 long date2 = route.date.getTime()+route.delay*60000;
		 int cmp = date1 > date2 ? +1 : date1 < date2 ? -1 : 0;
	     return cmp;
	 }
	
}
