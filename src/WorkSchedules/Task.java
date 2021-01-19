package WorkSchedules;

import java.util.Date;

public class Task {

	private String description;
	private Date startTime;
	private Date deadline;
	private boolean done;
	
	public Task(String description, Date startTime, Date deadline, boolean done) {
		if(startTime==null)
			throw new IllegalArgumentException("StartTime can not be null.");
		if(deadline==null)
			throw new IllegalArgumentException("Deadline can not be null.");
		if(startTime.getTime()>deadline.getTime())
			throw new IllegalArgumentException("StartTime can not be after deadline.");
		
		this.description = description;
		this.startTime = startTime;
		this.deadline = deadline;
		this.done = done;
	}

	public String getDescription() {
		return description;
	}

	public Date getStartTime() {
		return startTime;
	}

	public Date getDeadline() {
		return deadline;
	}
	
	public boolean getDone() {
		return done;
	}
	
}
