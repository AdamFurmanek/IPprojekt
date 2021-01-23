package TimeTables;

import java.util.List;

import Administration.Admin;
import Employees.Employee;

public class TimeTableProxy implements ITimeTable {

	private TimeTable timeTable;
	private boolean access;
	
	public TimeTableProxy(Admin admin, List<Route> routes) {
		this.timeTable = new TimeTable(routes);
		if(admin != null) {
			access=true;
		}
		else {
			access=false;
		}
	}
	
	public TimeTableProxy(Employee employee, List<Route> routes) {
		this.timeTable = new TimeTable(routes);
		if(employee != null) {
			access=true;
		}
		else {
			access=false;
		}
	}
	
	public TimeTableProxy(List<Route> routes) {
			this.timeTable = new TimeTable(routes);
			access=false;
	}
	
	public List <Route> getRoutes() throws Exception {
		if(timeTable.getRoutes().isEmpty())
			throw new Exception("Time table empty.");
		return timeTable.getRoutes();
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
