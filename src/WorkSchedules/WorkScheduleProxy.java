package WorkSchedules;

import java.util.List;

import Administration.Admin;
import Employees.Employee;

public class WorkScheduleProxy implements IWorkSchedule {

	private WorkSchedule workSchedule;
	private boolean access;

	//Konstruktor pozwalaj¹cy uzyskaæ dostêp adminowi.
	public WorkScheduleProxy(Admin admin, WorkSchedule workSchedule) {
		if(workSchedule==null)
			throw new IllegalArgumentException("WorkSchedule can not be null.");
		if(admin!=null) {
			this.workSchedule = workSchedule;
			access=true;
		}
		else {
			access=false;
		}
	}
	
	//Konstruktor pozwalaj¹cy uzyskaæ dostêp pracownikowi.
	public WorkScheduleProxy(Employee employee, WorkSchedule workSchedule) {
		if(workSchedule==null)
			throw new IllegalArgumentException("WorkSchedule can not be null.");
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
			if(workSchedule.getSchedule().isEmpty())
				throw new Exception("Work schedule empty.");
			else
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
