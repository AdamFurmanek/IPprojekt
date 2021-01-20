package WorkSchedules;

import java.util.Date;

import org.junit.Test;

import junit.framework.Assert;

public class TaskTest {

	@Test
	//Sprawdza poprawno�� konstruktora i getter�w.
	public void checkConstructorAndGetters(){
		Task task = new Task("Sprz�tanie peronu 1", new Date(2020,04,20,15,30), new Date(2020,04,20,16,45), false);
		
		Assert.assertEquals("Sprz�tanie peronu 1", task.getDescription());
		Assert.assertEquals(new Date(2020,04,20,15,30), task.getStartTime());
		Assert.assertEquals(new Date(2020,04,20,16,45), task.getEndTime());
		Assert.assertFalse(task.getIsDone());
	}
	
	@Test(expected = IllegalArgumentException.class)
	//Sprawdza wyj�tek je�li pocz�tkowa data to null.
	public void nullStartDate() {
		Task task = new Task("Sprz�tanie peronu 1", null, new Date(2020,04,20,16,45), false);
	}
	
	@Test(expected = IllegalArgumentException.class)
	//Sprawdza wyj�tek je�li ko�cowa data to null.
	public void nullDeadline() {
		Task task = new Task("Sprz�tanie peronu 1", new Date(2020,04,20,15,30), null, false);
	}
	
	@Test(expected = IllegalArgumentException.class)
	//Sprawdza wyj�tek je�li data ko�cowa wcze�niejsza od daty pocz�tkowej.
	public void deadlineBiggestThanStarTime() {
		Task task = new Task("Sprz�tanie peronu 1", new Date(2020,04,20,16,45), new Date(2020,04,20,15,30), false);
	}
	
}
