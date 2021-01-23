package WorkSchedules;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import Administration.Admin;
import Employees.Employee;
import junit.framework.Assert;

public class WorkScheduleProxyTest {

	List<Task> schedule;
	Task task1, task2;
	WorkSchedule workSchedule;
	WorkScheduleProxy correctAdmin, correctEmployee, wrongAdmin, wrongEmployee;
	
	@Before
    public void setUp() {
		task1 = new Task("Sprz�tanie peronu 1", new Date(2020,04,20,15,30), new Date(2020,04,20,16,45), false);
		task2 = new Task("Sprz�tanie peronu 2", new Date(2020,04,21,15,30), new Date(2020,04,21,16,45), false);
		schedule = new ArrayList<Task>();
		schedule.add(task1);
		workSchedule = new WorkSchedule(schedule);
		
		correctAdmin = new WorkScheduleProxy(new Admin("ADMIN1"),workSchedule);
		correctEmployee = new WorkScheduleProxy(new Admin("ADMIN1"),workSchedule);
		
		wrongAdmin = new WorkScheduleProxy((Admin)null,workSchedule);
		wrongEmployee = new WorkScheduleProxy((Employee)null,workSchedule);
    }
	
	@Test(expected = IllegalArgumentException.class)
	//Sprawdza wyj�tek je�li workSchedule to null.
	public void nullWorkSchedule() {
		WorkScheduleProxy workScheduleProxy = new WorkScheduleProxy(new Admin("ADMIN1"),null);
	}
	
	@Test
	//Sprawdza wykonywanie operacji na Tasku z prawid�owym dost�pem.
	public void modifyCorrectTask() throws Exception {
		correctAdmin.addTask(task1);
		correctEmployee.addTask(task1);
		Assert.assertEquals("Sprz�tanie peronu 1", correctAdmin.getSchedule().get(1).getDescription());
		Assert.assertEquals("Sprz�tanie peronu 1", correctEmployee.getSchedule().get(1).getDescription());
		correctAdmin.modifyTask(1, task2);
		correctEmployee.modifyTask(1, task2);
		Assert.assertEquals("Sprz�tanie peronu 2", correctAdmin.getSchedule().get(1).getDescription());
		Assert.assertEquals("Sprz�tanie peronu 2", correctEmployee.getSchedule().get(1).getDescription());
		correctAdmin.removeTask(0);
		correctEmployee.removeTask(0);
		Assert.assertEquals("Sprz�tanie peronu 2", correctAdmin.getSchedule().get(0).getDescription());
		Assert.assertEquals("Sprz�tanie peronu 2", correctEmployee.getSchedule().get(0).getDescription());
		
	}
	
	@Test(expected = Exception.class)
	//Sprawdza wyj�tek przy wykonywaniu operacji na Tasku z nieprawid�owym dost�pem.
	public void incorrectAdminAddTask() throws Exception {
		wrongAdmin.addTask(task1);
	}
	
	@Test(expected = Exception.class)
	//Sprawdza wyj�tek przy wykonywaniu operacji na Tasku z nieprawid�owym dost�pem.
	public void incorrectEmployeeAddTask() throws Exception {
		wrongEmployee.addTask(task1);
	}
	
	@Test(expected = Exception.class)
	//Sprawdza wyj�tek przy wykonywaniu operacji na Tasku z nieprawid�owym dost�pem.
	public void incorrectAdminRemoveTask() throws Exception {
		wrongAdmin.removeTask(0);
	}
	
	@Test(expected = Exception.class)
	//Sprawdza wyj�tek przy wykonywaniu operacji na Tasku z nieprawid�owym dost�pem.
	public void incorrectEmployeeRemoveTask() throws Exception {
		wrongEmployee.removeTask(0);
	}
	
	@Test(expected = Exception.class)
	//Sprawdza wyj�tek przy wykonywaniu operacji na Tasku z nieprawid�owym dost�pem.
	public void incorrectAdminModifyTask() throws Exception {
		wrongAdmin.modifyTask(0, task2);
	}
	
	@Test(expected = Exception.class)
	//Sprawdza wyj�tek przy wykonywaniu operacji na Tasku z nieprawid�owym dost�pem.
	public void incorrectEmployeeModifyTask() throws Exception {
		wrongEmployee.modifyTask(0, task2);
	}
	
	@Test(expected = Exception.class)
	//Sprawdza wyj�tek przy dost�pie do pustej listy.
	public void emptyList() throws Exception {
		correctAdmin.removeTask(0);
		correctAdmin.getSchedule();
	}
	
}
