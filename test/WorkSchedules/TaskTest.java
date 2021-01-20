package WorkSchedules;

import java.util.Date;

import org.junit.Test;

import junit.framework.Assert;

public class TaskTest {

	@Test
	//Sprawdza poprawnoœæ konstruktora i getterów.
	public void checkConstructorAndGetters(){
		Task task = new Task("Sprz¹tanie peronu 1", new Date(2020,04,20,15,30), new Date(2020,04,20,16,45), false);
		
		Assert.assertEquals("Sprz¹tanie peronu 1", task.getDescription());
		Assert.assertEquals(new Date(2020,04,20,15,30), task.getStartTime());
		Assert.assertEquals(new Date(2020,04,20,16,45), task.getEndTime());
		Assert.assertFalse(task.getIsDone());
	}
	
	@Test(expected = IllegalArgumentException.class)
	//Sprawdza wyj¹tek jeœli pocz¹tkowa data to null.
	public void nullStartDate() {
		Task task = new Task("Sprz¹tanie peronu 1", null, new Date(2020,04,20,16,45), false);
	}
	
	@Test(expected = IllegalArgumentException.class)
	//Sprawdza wyj¹tek jeœli koñcowa data to null.
	public void nullDeadline() {
		Task task = new Task("Sprz¹tanie peronu 1", new Date(2020,04,20,15,30), null, false);
	}
	
	@Test(expected = IllegalArgumentException.class)
	//Sprawdza wyj¹tek jeœli data koñcowa wczeœniejsza od daty pocz¹tkowej.
	public void deadlineBiggestThanStarTime() {
		Task task = new Task("Sprz¹tanie peronu 1", new Date(2020,04,20,16,45), new Date(2020,04,20,15,30), false);
	}
	
}
