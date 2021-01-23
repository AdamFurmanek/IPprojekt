package WorkSchedules;

import java.util.Date;

public class Task {

	//Task jest obiektem niezmiennym.
	//Aby go zmodyfikowaæ, nale¿y podmieniæ stary obiekt nowym obiektem.
	
	private String description;
	private Date startTime;
	private Date endTime;
	private boolean isDone;
	
	public Task(String description, Date startTime, Date endTime, boolean isDone) {
		if(startTime==null)
			throw new IllegalArgumentException("StartTime can not be null.");
		if(endTime==null)
			throw new IllegalArgumentException("EndTime can not be null.");
		if(startTime.getTime()>endTime.getTime())
			throw new IllegalArgumentException("StartTime can not be after endTime.");
		
		this.description = description;
		this.startTime = startTime;
		this.endTime = endTime;
		this.isDone = isDone;
	}

	public String getDescription() {
		return description;
	}

	public Date getStartTime() {
		return startTime;
	}

	public Date getEndTime() {
		return endTime;
	}
	
	public boolean getIsDone() {
		return isDone;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Task) {
			Task another = (Task)obj;
			return this.description.equals(another.description) && this.startTime.equals(another.startTime) && this.endTime.equals(another.endTime);
		}
		else return false;
	}
	
}
