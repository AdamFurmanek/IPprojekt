package WorkSchedules;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class WorkScheduleTest {
	
	List<Task> schedule;
	Task task1, task2;

	@Before
    public void setUp() {
		task1 = new Task("Sprz¹tanie peronu 1", new Date(2020,04,20,15,30), new Date(2020,04,20,16,45), false);
		task2 = new Task("Sprz¹tanie peronu 2", new Date(2020,04,21,15,30), new Date(2020,04,21,16,45), false);
		schedule = new ArrayList<Task>();
		schedule.add(task1);
    }
	
	@Test
	//Sprawdza poprawnoœæ konstruktora i getterów.
	public void checkConstructorAndGetters(){
		WorkSchedule workSchedule = new WorkSchedule(schedule);
		Assert.assertEquals("Sprz¹tanie peronu 1", workSchedule.getSchedule().get(0).getDescription());
	}
	
	@Test(expected = IllegalArgumentException.class)
	//Sprawdza wyj¹tek jeœli list tasków to null.
	public void nullSchedule() {
		WorkSchedule workSchedule = new WorkSchedule(null);
	}
	
	@Test
	//Sprawdza poprawnoœæ modyfikacji Taska.
	public void modifyTask() {
		WorkSchedule workSchedule = new WorkSchedule(schedule);
		workSchedule.modifyTask(0, task2);
		Assert.assertEquals("Sprz¹tanie peronu 2", workSchedule.getSchedule().get(0).getDescription());
	}
	
	@Test(expected = IllegalArgumentException.class)
	//Sprawdza wyj¹tek jeœli z³e id przy modyfikacji.
	public void modifyTaskWrongId() {
		WorkSchedule workSchedule = new WorkSchedule(schedule);
		workSchedule.modifyTask(1, task2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	//Sprawdza wyj¹tek jeœli task to null przy modyfikacji.
	public void modifyTaskNullTask() {
		WorkSchedule workSchedule = new WorkSchedule(schedule);
		workSchedule.modifyTask(0, null);
	}
	
	@Test
	//Sprawdza poprawnoœæ dodania.
	public void addTask() {
		WorkSchedule workSchedule = new WorkSchedule(schedule);
		workSchedule.addTask(task2);
		Assert.assertEquals("Sprz¹tanie peronu 2", workSchedule.getSchedule().get(1).getDescription());
	}
	
	@Test(expected = IllegalArgumentException.class)
	//Sprawdza wyj¹tek jeœli task to null przy dodaniu.
	public void addTaskNullTask() {
		WorkSchedule workSchedule = new WorkSchedule(schedule);
		workSchedule.modifyTask(0, null);
	}
	
	@Test
	//Sprawdza poprawnoœæ usuniêciu.
	public void removeTask() {
		WorkSchedule workSchedule = new WorkSchedule(schedule);
		workSchedule.removeTask(0);
		Assert.assertEquals(0, workSchedule.getSchedule().size());
	}
	
	@Test(expected = IllegalArgumentException.class)
	//Sprawdza wyj¹tek jeœli z³e id przy usuniêciu.
	public void removeTaskWrongId() {
		WorkSchedule workSchedule = new WorkSchedule(schedule);
		workSchedule.modifyTask(1, task2);
	}
	
}
