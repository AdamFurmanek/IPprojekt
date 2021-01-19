package TimeTables;

import java.util.*;

public class TimeTable implements ITimeTable {
	
	private List <Route> routes;

	public TimeTable(List<Route> routes) {
		this.routes = routes;
	}
	
	public List <Route> getRoutes(){
		return routes;
	}
	
	public void modifyRoute(int id, Route route) {
		routes.remove(id);
		routes.add(route);
		Refresh();
	}
	
	public void deleteRoute(int id) {
		routes.remove(id);
	}
	
	public void addRoute(Route route) {
		routes.add(route);
		Refresh();
	}
	
	private void Refresh() {
		 Collections.sort(routes); 
	}
	
}
