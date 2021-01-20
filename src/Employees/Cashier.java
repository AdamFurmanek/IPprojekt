package Employees;

import java.util.Date;

import Tickets.Passenger;
import Tickets.Ticket;
import TimeTables.Route;
import WorkSchedules.WorkSchedule;

public class Cashier extends Employee {
	Cashier(String firstName, String finalName, Date dateOfBirth, String address, Date dateOfEmployment, WorkSchedule workSchedule) {
		super(firstName, finalName, dateOfBirth, address, dateOfEmployment, workSchedule);
		this.payment = 1900;
	}
	
	Ticket sellTicket(Passenger passenger, Route route, String type) {
		return passenger.buyTicket(route, type);
	}
}