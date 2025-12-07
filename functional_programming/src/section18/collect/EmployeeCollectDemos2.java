package section18.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employee{
	private String name;
	private int age;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}
	
	
}
public class EmployeeCollectDemos2 {

	public static void main(String[] args) {
		// Implement the logic
		
		List<Employee> employee = Arrays.asList(
				new Employee("Ramesh", 30),
				new Employee("Bob", 25),
				new Employee("Sanjay", 35));
		
		Stream<Employee> stream = employee.stream(); 
		List<String> result = stream.map(Employee::getName)// source of stream
				              .collect(Collectors.toList());
		System.out.println(result);

	}

}
