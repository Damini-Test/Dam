package Encapsulation;

public class Employee {
	private String ename;
	private int eid;
	private double salary;
	private String job;

	public void displayDetails() {
		System.out.println(" Employee name:" + ename);
		System.out.println("Id :" + eid);
		System.out.println("Salary" + salary);

	}

	Employee(String ename, int eid, double salary, String job) {
		this.ename = ename;
		this.eid = eid;
		this.salary = salary;
		this.job = job;
	}

	// getter methods

	public String getEname() {
		return ename;

	}

	public int getEid() {
		return eid;
	}

	public double getsalary() {
		return salary;

	}

	public String getjob() {
		return job;
	}

// Setter Methods
	public void setEid(String ename) {
		this.ename = ename;

	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public void setsalary(double salary) {
		this.salary = salary;

	}

	public void setjob(String job) {
		this.job = job;
	}

}
