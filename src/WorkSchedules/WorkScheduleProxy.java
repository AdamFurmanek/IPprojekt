package WorkSchedules;

import java.util.List;

import Administration.Admin;
import Employees.Employee;

public class WorkScheduleProxy implements IWorkSchedule {

	private WorkSchedule workSchedule;
	private boolean access;

	public WorkScheduleProxy(Admin admin, WorkSchedule workSchedule) {
		if(admin!=null) {
			this.workSchedule = workSchedule;
			access=true;
		}
		else {
			access=false;
		}
	}
	
	public WorkScheduleProxy(Employee employee, WorkSchedule workSchedule) {
		if(employee!=null) {
			this.workSchedule = workSchedule;
			access=true;
		}
		else {
			access=false;
		}
	}

	public List<Task> getSchedule() throws Exception {
		if(access)
			return workSchedule.getSchedule();
		else
			throw new Exception("You do not have permission.");
	}
	
	public void modifyTask(int id, Task task) throws Exception {
		if(access)
			workSchedule.modifyTask(id, task);
		else
			throw new Exception("You do not have permission.");
	}

	public void addTask(Task task) throws Exception {
		if(access)
			workSchedule.addTask(task);
		else
			throw new Exception("You do not have permission.");
	}
	
	public void removeTask(int id) throws Exception {
		if(access)
			workSchedule.removeTask(id);
		else
			throw new Exception("You do not have permission.");
	}
	
}
