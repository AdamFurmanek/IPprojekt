package TimeTables;

import java.util.Date;

public class Station {

	private String stationName;
	private Date date;
	
	public Station(String stationName, Date date) {
		if(stationName==null)
			throw new IllegalArgumentException("StationName can not be null.");
		if(date==null)
			throw new IllegalArgumentException("Date can not be null.");
		this.stationName = stationName;
		this.date = date;
	}
	
	public String getStationName() {
		return stationName;
	}

	public Date getDate() {
		return date;
	}

}
