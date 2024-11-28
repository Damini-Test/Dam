package Encapsulation;

public class EmployeeDriver {

	public static void main(String[] args) {
		Employee e1 = new Employee("Venkatesh", 101, 40000.0, "Database Administrator");
		Employee e2 = new Employee("Prashu", 102, 70000.0, "Senior Tester");
		Employee e3 = new Employee("Harshu", 103, 12000.0, "Java Trainer");

		displayDetails(e1);
		displayDetails(e2);
		displayDetails(e3);

	}

	public static void displayDetails(Employee e) {
		System.out.println("ename :" + e.getEname());
		System.out.println("eid :" + e.getEid());
		System.out.println("Salary :" + e.getsalary());
		System.out.println("Job :" + e.getjob());

	}

}
