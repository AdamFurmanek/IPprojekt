package Employees;

import WorkSchedules.Task;
import WorkSchedules.WorkSchedule;
import TimeTables.Route;
import TimeTables.TimeTable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertThrows;

import Carriers.Carrier;
import junit.framework.Assert;

public class EmployeeFactoryTest
{
	Employee employee1;
	Employee employee2;
	Employee employee3;
	
	WorkSchedule forEmp1;
	WorkSchedule forEmp2;
	WorkSchedule forEmp3;
	List<Task> tasks1;
	List<Task> tasks2;
	List<Task> tasks3;
	
	@Before
	public void rehearsal() {
		Task task1 = new Task("Sprzeda¿ 1", new Date(2020,04,20,15,30), new Date(2020,04,20,16,45), false);
		Task task2 = new Task("Sprzeda¿ 2", new Date(2020,04,21,15,30), new Date(2020,04,21,16,45), false);
		Task task3 = new Task("Sprawdzanie kamer 1", new Date(2020,04,20,15,30), new Date(2020,04,20,16,45), false);
		Task task4 = new Task("Sprawdzanie kamer 2", new Date(2020,04,20,15,30), new Date(2020,04,20,16,45), false);
		Task task5 = new Task("Sprz¹tanie peronu 1", new Date(2020,04,21,15,30), new Date(2020,04,21,16,45), false);
		Task task6 = new Task("Sprz¹tanie peronu 2", new Date(2020,04,20,15,30), new Date(2020,04,20,16,45), false);
		tasks1 = new ArrayList<Task>();
		tasks2 = new ArrayList<Task>();
		tasks3 = new ArrayList<Task>();
		tasks1.add(task1);
		tasks1.add(task2);
		tasks2.add(task3);
		tasks2.add(task4);
		tasks3.add(task5);
		tasks3.add(task6);
		forEmp1 = new WorkSchedule(tasks1);
		forEmp2 = new WorkSchedule(tasks2);
		forEmp3 = new WorkSchedule(tasks3);
		
		employee1 = EmployeeFactory.giveEmployeeJob("Jakub", "Bednarski", new Date(1998,6,24), "ul. Rubinowa 12 25-342 Kielce", new Date(2018,7,1), forEmp1, "Cashier");
		employee2 = EmployeeFactory.giveEmployeeJob("Adam", "Furmanek", new Date(1998,7,29), "ul. Szafirowa 23 25-532 Kielce", new Date(2018,5,11), forEmp2, "Bodyguard");
		employee3 = EmployeeFactory.giveEmployeeJob("Tomasz", "Gêbski", new Date(1998,8,17), "ul. Szmaragdowa 34 25-434 Kielce", new Date(2018,6,20), forEmp3, "Worker");
	}
	
	
	@Test
	public void testEmployeeFactoryWork() {
		Assert.assertEquals("Jakub", employee1.firstName);
		Assert.assertEquals("Bednarski", employee1.finalName);
		Assert.assertEquals(new Date(1998,6,24), employee1.dateOfBirth);
		Assert.assertEquals("ul. Rubinowa 12 25-342 Kielce", employee1.address);
		Assert.assertEquals(new Date(2018,7,1), employee1.dateOfEmployment);
		Assert.assertEquals(forEmp1, employee1.workSchedule);
		Assert.assertEquals(true, employee1 instanceof Cashier);
		
		Assert.assertEquals("Adam", employee2.firstName);
		Assert.assertEquals("Furmanek", employee2.finalName);
		Assert.assertEquals(new Date(1998,7,29), employee2.dateOfBirth);
		Assert.assertEquals("ul. Szafirowa 23 25-532 Kielce", employee2.address);
		Assert.assertEquals(new Date(2018,5,11), employee2.dateOfEmployment);
		Assert.assertEquals(forEmp2, employee2.workSchedule);
		Assert.assertEquals(true, employee2 instanceof Bodyguard);
		
		Assert.assertEquals("Tomasz", employee3.firstName);
		Assert.assertEquals("Gêbski", employee3.finalName);
		Assert.assertEquals(new Date(1998,8,17), employee3.dateOfBirth);
		Assert.assertEquals("ul. Szmaragdowa 34 25-434 Kielce", employee3.address);
		Assert.assertEquals(new Date(2018,6,20), employee3.dateOfEmployment);
		Assert.assertEquals(forEmp3, employee3.workSchedule);
		Assert.assertEquals(true, employee3 instanceof Worker);
	}
	
	@Test(expected = Exception.class)
	public void testTimeTableChecking() {
		Route route1 = new Route(new Carrier("WKD"), "Warszawa-Kraków", new Date(2021,1,1), "Peron A", 12);
		Route route2 = new Route(new Carrier("Koleje Ma³opolskie"), "Kraków-Warszawa", new Date(2021,1,2), "Peron B", 12);
		List<Route> routes = null;
		routes.add(route1);
		routes.add(route2);
		TimeTable tt = new TimeTable(routes);
		try {
			employee1.checkTimetable(tt);
			employee2.checkTimetable(tt);
			employee3.checkTimetable(tt);
		} catch (Exception e) {
			Assert.assertNotSame("You do not have permission.", e.getMessage());
			Assert.assertNotSame("Time table empty.", e.getMessage());
		}
		
	}
	
	@Test
	public void testExecutionConfirmation()
	{
		Task completedTask = new Task("Sprzeda¿ 1", new Date(2020,04,20,15,30), new Date(2020,04,20,16,45), false);
		try {
			employee1.confirmExecution(completedTask);
		} catch (Exception e) {
			Assert.assertNotSame("You do not have permission.", e.getMessage());
			Assert.assertNotSame("Task not found.", e.getMessage());
			Assert.assertNotSame("Work schedule empty.", e.getMessage());
			Assert.assertNotSame("Schedule can not be null.", e.getMessage());
			Assert.assertNotSame("Wrong id.", e.getMessage());
			Assert.assertNotSame("Task can not be null.", e.getMessage());
		}
	}
	
	@Test
	public void testServiceExecution()
	{
		Worker emp = (Worker)employee3;
		try {
			emp.executeService();
		} catch (Exception e) {
			Assert.assertNotSame("You do not have permission.", e.getMessage());
			Assert.assertNotSame("Work schedule empty.", e.getMessage());
		}
	}
}