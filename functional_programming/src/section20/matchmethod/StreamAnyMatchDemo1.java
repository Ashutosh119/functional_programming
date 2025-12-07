package section20.matchmethod;

import java.util.Arrays;
import java.util.List;

class Employee{
	private int id;
	private String name;
	private double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
public class StreamAnyMatchDemo1 {

	public static void main(String[] args) {
		
		
		List<Employee> emp = Arrays.asList(
				new Employee(1, "Ramesh", 21000.00),
				new Employee(2, "John",35000.00 ),
				new Employee(3, "Vaibhav", 55000.00),
				new Employee(4, "Mano", 42000),
				new Employee(5, "Suresh", 45000)
				);
		
		boolean result =emp.stream().anyMatch((empl)-> empl.getSalary() > 45000);
		System.out.println(result);

	}

}
