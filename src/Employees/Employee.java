package Employees;

import java.util.Date;

import WorkSchedules.WorkSchedule;

public class Employee {
	protected String firstName;
	protected String finalName;
	protected Date dateOfBirth;
	protected String address;
	protected Date dateOfEmployment;
	protected WorkSchedule workSchedule;
	protected float payment;
	
	Employee(String firstName, String finalName, Date dateOfBirth, String address, Date dateOfEmployment, WorkSchedule workSchedule) {
		this.firstName = firstName;
		this.finalName = finalName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.dateOfEmployment = dateOfEmployment;
		this.workSchedule = workSchedule;
	}
	
	void checkWorkSchedule() {
		System.out.println("Zadania do zrobienia:");
		for(int i=0; i<workSchedule.getSchedule().size(); i++) {
			System.out.println("\t- " + workSchedule.getSchedule().get(i).getDescription() + "\n");
		}
	}
	
	void confirmExecution() {
		
	}
	
	void checkTimetable() {
		
	}
	
}