package DworzecPKP;

import java.util.List;

public class Route {

	List<String> stationChain;
	List<String> returnStationChain;
	Carrier carrier;
	
	Route(List<String> stationChain, List<String> returnStationChain, Carrier carrier){
		this.stationChain = stationChain;
		this.returnStationChain = returnStationChain;
		this.carrier = carrier;
	}
}
