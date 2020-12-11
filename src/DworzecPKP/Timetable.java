package DworzecPKP;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class Timetable {

	protected List <Route> allRoutes;
	Map <LocalDateTime,Route> timetable;
	
	Timetable(List <Route> allRoutes, Map <LocalDateTime,Route> timetable){
		this.allRoutes = allRoutes;
		this.timetable = timetable;
		
	}
}
