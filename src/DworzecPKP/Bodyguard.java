package DworzecPKP;

import java.util.Date;

public class Bodyguard extends Employee {
	
	Bodyguard(String firstName, String finalName, Date dateOfBirth, String address, Date dateOfEmployment, WorkSchedule workSchedule) {
		super(firstName, finalName, dateOfBirth, address, dateOfEmployment, workSchedule);
		this.payment = 2000;
	}
	
	void checkCameras() {
		
	}
}