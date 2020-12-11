package DworzecPKP;

import java.util.List;

public class WorkSchedule {

	protected List<Task> schedule;
	
	WorkSchedule(List<Task> schedule) {
		this.schedule = schedule;
	}
	
	Task getTask(int index){
		return schedule.get(index);
	}
	
	int getSize(){
		return schedule.size();
	}
}
