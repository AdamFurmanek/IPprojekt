package WorkSchedules;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;

import Administration.Admin;
import Employees.Employee;

public class WorkScheduleProxyTest {

	List<Task> schedule;
	Task task1, task2;
	WorkSchedule workSchedule;
	
	@Before
    public void setUp() {
		task1 = new Task("Sprz¹tanie peronu 1", new Date(2020,04,20,15,30), new Date(2020,04,20,16,45), false);
		task2 = new Task("Sprz¹tanie peronu 2", new Date(2020,04,21,15,30), new Date(2020,04,21,16,45), false);
		schedule = new ArrayList<Task>();
		schedule.add(task1);
		workSchedule = new WorkSchedule(schedule);
		
		WorkScheduleProxy correctAdmin = new WorkScheduleProxy(new Admin("ADMIN1"),workSchedule);
		WorkScheduleProxy correctEmployee = new WorkScheduleProxy(new Admin("ADMIN1"),workSchedule);
		
		WorkScheduleProxy wrongAdmin = new WorkScheduleProxy((Admin)null,workSchedule);
		WorkScheduleProxy wrongEmployee = new WorkScheduleProxy((Employee)null,workSchedule);
    }
	
}
