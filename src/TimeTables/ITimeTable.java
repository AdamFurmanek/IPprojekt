package TimeTables;

import java.util.List;

public interface ITimeTable {

	//Get trasy
	public List <Route> getRoutes() throws Exception;
	
	//Modyfikuj trasê
	public void modifyRoute(int id, Route route) throws Exception;
	
	//Usuñ trasê
	public void deleteRoute(int id) throws Exception;
	
	//Dodaj trasê
	public void addRoute(Route route) throws Exception;
	
}
