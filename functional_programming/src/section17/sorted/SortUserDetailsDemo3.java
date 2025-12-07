package section17.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Users{
	
	private String name;
	private int age;
	public Users(String name, int age) {
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
		return "Users [name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
	
}

public class SortUserDetailsDemo3 {

	public static void main(String[] args) {
		// User Details -- Sort with Age
		
		List<Users> user = Arrays.asList(
				new Users("Ramesh", 20),
				new Users("Vimal", 19),
				new  Users("Deepak", 25),
				new Users("Harshit", 18),
				new Users("Jasvinder", 25)
				);
		
//		Comparator<Users> userComparator = new Comparator<Users>() {
//
//			@Override
//			public int compare(Users o1, Users o2) {
//				// TODO Auto-generated method stub
//				return o1.getAge()- o2.getAge();
//			}
//			
//		};
//		   List<Users> result1=    user.stream().sorted(userComparator).toList();
//		   System.out.println(result1);
		
		List<Users> userData = user.stream
				().sorted((o1, o2) -> o1.getAge() - o2.getAge()).toList();
		System.out.println("Sort details by age : " + userData);
		
		System.out.println("Sort details by name:--------------------");
//		List<Users> list1 = user.stream().sorted((o1, o2) -> o1.getName().compareTo(getName())).toList();
//		System.out.println(list);
		
		List<Users> list1 = user.stream()
		        .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()))
		        .toList();

		System.out.println(list1);

	}

}
