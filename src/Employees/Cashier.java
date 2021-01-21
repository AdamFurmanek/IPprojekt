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
	
	Ticket sellTicket(Route route, String type) {
		//Metoda używana gdy klient przychodzi do kasjera i chce kupić bilet.
		//Kasjer prosi klienta o dane (tworzy się obiekt klasy Passenger)
		// i nowo utworzony obiekt wywołuje metodę kupna biletu.
		Passenger passenger = new Passenger("Imię", "Nazwisko", "telefon","email");
		return passenger.buyTicket(route, type);
	}
}