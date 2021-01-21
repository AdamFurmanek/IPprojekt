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
			System.out.println("\t- "+ workSchedule.getSchedule().get(i).getDescription()+"\n");
		}
	}
	
	void confirmExecution(Task done) throws Exception {
		WorkScheduleProxy account = new WorkScheduleProxy(this,workSchedule);
		List<Task> currentTasks = account.getSchedule();
		//znajdywanie taska i ustawienie boolean done na true po znalezieniu go
	}
	
	void checkTimetable(TimeTable tt) throws Exception {
		TimeTableProxy checker = new TimeTableProxy(tt.getRoutes());
		List<Route> routes = checker.getRoutes();
		//iteracja wyœwietlaj¹ca wszystkie instancje rozk³adu uzyskanego przez proxy
	}
	
}