package Employees;

import java.util.Date;
import java.util.List;

import TimeTables.Route;
import TimeTables.TimeTable;
import TimeTables.TimeTableProxy;
import WorkSchedules.Task;
import WorkSchedules.WorkSchedule;
import WorkSchedules.WorkScheduleProxy;

public class Employee {
	protected String firstName;
	protected String finalName;
	protected Date dateOfBirth;
	protected String address;
	protected Date dateOfEmployment;
	protected WorkSchedule workSchedule;
	protected float payment;
	
	Employee(String firstName, String finalName, Date dateOfBirth, String address, Date dateOfEmployment, WorkSchedule workSchedule) {
		this.firstName = firstName;
		this.finalName = finalName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.dateOfEmployment = dateOfEmployment;
		this.workSchedule = workSchedule;
	}
	
	void checkWorkSchedule() {
		System.out.println("Zadania do zrobienia:");
		for(int i=0; i<workSchedule.getSchedule().size(); i++) {
			System.out.println("\t- "+ workSchedule.getSchedule().get(i).getDescription());
		}
	}
	
	void confirmExecution(Task done) throws Exception {
		boolean found = false;
		WorkScheduleProxy account = new WorkScheduleProxy(this,workSchedule);
		List<Task> currentTasks = account.getSchedule();
		for(int i=0; i<currentTasks.size(); i++) {
			System.out.println("\t- "+ currentTasks.get(i).getDescription());
			if(currentTasks.get(i).equals(done)) {
				found = true;
				//zgłaszanie wykonania taska
			}
		}
		System.out.println("Task do usunięcia: "+done.getDescription());
		if(!found)
			throw new Exception("Task not found.");
	}
	
	void checkTimetable(TimeTable tt) throws Exception {
		TimeTableProxy checker = new TimeTableProxy(tt.getRoutes());
		List<Route> routes = checker.getRoutes();
		System.out.println(routes.size());
		for(int i=0; i<routes.size(); i++) {
			System.out.print(routes.get(i).getTrainName()+"\t");
			System.out.print(routes.get(i).getDate().getDay()+"-"+routes.get(i).getDate().getMonth()+"-"+routes.get(i).getDate().getYear()+"\t");
			System.out.println(routes.get(i).getPlatform());
		}
	}
	
}