package Employees;

import java.util.Date;
import java.util.Random;

import WorkSchedules.WorkSchedule;

public class Bodyguard extends Employee {
	Bodyguard(String firstName, String finalName, Date dateOfBirth, String address, Date dateOfEmployment, WorkSchedule workSchedule) {
		super(firstName, finalName, dateOfBirth, address, dateOfEmployment, workSchedule);
		this.payment = 2000;
	}
	
	//To jest prosty model
	void checkCameras(int numOfCams) {
		Random incidents = new Random();
		int incProb = 0;
		for(int i=1; i<=numOfCams; i++) {
			incProb = incidents.nextInt(1000);
			if(incProb < 1)
				System.out.println("Camera nr "+i+" - INCIDENT.");
			else System.out.println("Camera nr "+i+" - everything is alright");
		}
	}
}