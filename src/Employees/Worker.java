package Employees;

import java.util.Date;
import java.util.List;

import WorkSchedules.Task;
import WorkSchedules.WorkSchedule;
import WorkSchedules.WorkScheduleProxy;

public class Worker extends Employee {
	Worker(String firstName, String finalName, Date dateOfBirth, String address, Date dateOfEmployment, WorkSchedule workSchedule) {
		super(firstName, finalName, dateOfBirth, address, dateOfEmployment, workSchedule);
		this.payment = 2200;
	}
	
	void executeService() throws Exception {
		Date now = new Date();
		WorkScheduleProxy account = new WorkScheduleProxy(this,workSchedule);
		List<Task> currentTasks = account.getSchedule();
		//szukanie w currentTasks takiego taska, co jest do zrobienia na najwcześniej i zwrócenie go w celu obsługi
		System.out.println("Job to do now: "/*Tu powinno być wypisane polecenie i deadline*/);
	}
}