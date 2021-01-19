package WorkSchedules;

import java.util.List;

public class WorkSchedule implements IWorkSchedule {

	private List<Task> schedule;

	public WorkSchedule(List<Task> schedule) {
		if(schedule==null)
			throw new IllegalArgumentException("Schedule can not be null.");
		
		this.schedule = schedule;
	}

	public List<Task> getSchedule() {
		return schedule;
	}
	
	public void modifyTask(int id, Task task) {
		if(schedule.size()<=id)
			throw new IllegalArgumentException("Wrong id.");
		if(task==null)
			throw new IllegalArgumentException("Task can not be null.");
		schedule.remove(id);
		schedule.add(task);
	}

	public void addTask(Task task) {
		if(task==null)
			throw new IllegalArgumentException("Task can not be null.");
		schedule.add(task);
	}
	
	public void removeTask(int id) {
		if(schedule.size()<=id)
			throw new IllegalArgumentException("Wrong id.");
		schedule.remove(id);
	}
	
}
