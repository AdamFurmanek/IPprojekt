package WorkSchedules;

import java.util.List;

public interface IWorkSchedule {

	public List<Task> getSchedule() throws Exception ;
	
	public void modifyTask(int id, Task task) throws Exception ;

	public void addTask(Task task) throws Exception ;
	
	public void removeTask(int id) throws Exception ;
}
