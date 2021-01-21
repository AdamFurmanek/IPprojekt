import Employee;
import Bodyguard;
import Cashier;
import Worker;

public class EmployeeFactory {
	public Employee giveEmployeeJob(String firstName, String finalName, Date dateOfBirth, String address, Date dateOfEmployment, WorkSchedule workSchedule, String profession) {
		if(profession.equals("Bodyguard"))
			return new Bodyguard(firstName,finalName,dateOfBirth,address,dateOfEmployment,workSchedule);
		else if(profession.equals("Cashier"))
			return new Cashier(firstName,finalName,dateOfBirth,address,dateOfEmployment,workSchedule);
		else if(profession.equals("Worker"))
			return new Worker(firstName,finalName,dateOfBirth,address,dateOfEmployment,workSchedule);
		else return new IllegalArgumentException("You cannot hire a new employee as "+profession+"!");
			
	}
}