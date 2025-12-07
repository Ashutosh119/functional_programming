package section24.arraylist;

import java.util.ArrayList;
import java.util.List;

class Employee{
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	public Employee(int id, String firstname, String lastname, String email) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
	
	
}
public class ArrayListUserDefineObjectDemo5 {

	public static void main(String[] args) {
		
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee(1, "Shree", "Krishna", "shree@gmail.com"));
				employee.add(new Employee(2, "Murli", "Ji", "murli@gmail.com"));
				employee.add(new Employee(3, "Manshukh", "Pandey", "manshukh@gmail.com"));
				employee.forEach((emp) -> System.out.println(emp));

	}

}
