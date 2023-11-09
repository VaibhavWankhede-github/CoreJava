package encapsulation;

public class Employee {
	private int salary;

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if (salary > 0)
			this.salary = salary;
		else
			this.salary = 0;
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setSalary(100000);
		System.out.println(employee.getSalary());

	}

}
