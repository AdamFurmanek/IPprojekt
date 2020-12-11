package DworzecPKP;

import java.util.Date;

public class Task {

	protected String description;
	protected Date deadline;
	
	Task(String description, Date deadline){
		this.description = description;
		this.deadline = deadline;
	}
	
	String getDescription(){
		return description;
	}
	
}
