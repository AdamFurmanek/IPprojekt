package TimeTables;

import java.util.List;

public class TimeTableProxy implements ITimeTable {

	private TimeTable timeTable;
	private boolean access;
	
	public TimeTableProxy(String key, List<Route> routes) {
		if(key=="ABCD") {
			this.timeTable = new TimeTable(routes);
			access=true;
		}
		else {
			access=false;
		}
	}
	
	public List <Route> getRoutes() throws Exception {
		if(access)
			return timeTable.getRoutes();
		else
			throw new Exception("You do not have permission.");
	}
	
	public void modifyRoute(int id, Route route) throws Exception {
		if(access)
			timeTable.modifyRoute(id, route);
		else
			throw new Exception("You do not have permission.");
	}
	
	public void deleteRoute(int id) throws Exception {
		if(access)
			timeTable.deleteRoute(id);
		else
			throw new Exception("You do not have permission.");

	}
	
	public void addRoute(Route route) throws Exception {
		if(access)
			timeTable.addRoute(route);
		else
			throw new Exception("You do not have permission.");

	}
	
}
