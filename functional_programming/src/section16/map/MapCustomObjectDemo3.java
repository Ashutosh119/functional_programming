package section16.map;

import java.util.ArrayList;
import java.util.List;

class User {
	private int id;
	private String userName;
	private String password;
	private String email;
	public User(int id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + "]";
	}
	
	
}
public class MapCustomObjectDemo3 {

	public static void main(String[] args) {
		// Create a list
		
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Ramesh", "Ramesh123", "Ramesh@gmail.com"));
		users.add(new User(2, "Ram", "Ram12345", "Ram@gmail.com"));
		users.add(new User(3, "Shyam", "Shyam12300", "Shyam@gmail.com"));
		
		//Print only email id for all users
		 List<String> emailId = users.stream().map((user) -> user.getEmail()).toList();
		System.out.println("List of email details from the users " + emailId);
		
		//Peek method
		System.out.println("========== Peek Method Implement =================");
		List<String> usersDetails = users.stream().peek((user) -> System.out.println(user.toString()))
				.map((user) -> user.getEmail()).peek((element) -> System.out.println(element)).toList();
	     

	}

}
