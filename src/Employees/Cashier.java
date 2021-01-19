package Employees;

import java.util.Date;

import Tickets.TicketType;
import WorkSchedules.WorkSchedule;

public class Cashier extends Employee {
	Cashier(String firstName, String finalName, Date dateOfBirth, String address, Date dateOfEmployment, WorkSchedule workSchedule) {
		super(firstName, finalName, dateOfBirth, address, dateOfEmployment, workSchedule);
		this.payment = 1900;
	}
	
	void sellTicket(TicketType ticket) {
		
	}
}