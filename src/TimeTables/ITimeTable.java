package TimeTables;

import java.util.List;

public interface ITimeTable {

	//Get trasy
	public List <Route> getRoutes() throws Exception;
	
	//Modyfikuj tras�
	public void modifyRoute(int id, Route route) throws Exception;
	
	//Usu� tras�
	public void deleteRoute(int id) throws Exception;
	
	//Dodaj tras�
	public void addRoute(Route route) throws Exception;
	
}
