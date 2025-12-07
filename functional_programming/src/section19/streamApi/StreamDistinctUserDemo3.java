package section19.streamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

class User {
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	public User(int id, String firstname, String lastname, String email) {
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
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return id == other.id;
	}
	
	
}
public class StreamDistinctUserDemo3 {

	public static void main(String[] args) {
		
		List<User> user = Arrays.asList(
				new User(1, "Ramesh", "Fadtare", "Ramesh@gmail"),
				new User(2, "Sanjay", "Sharma", "Sanjay@gmail.com"),
				new User(1, "Vaibhav", "K", "Vaibhav@gmail"),
				new User(3, "Dinesh", "Singh", "Dinesh@gmail.com"),
				new User(2, "Hemendra", "Bisth", "hemendra@gmail.com"));
		
		List<User> distinctResult = user.stream().distinct().toList();
		distinctResult.forEach((ds) -> System.out.println(ds.toString()));
		

	}

}
