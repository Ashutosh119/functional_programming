package section26.hashset;

import java.util.HashSet;
import java.util.Set;

class Student {
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}

public class UserDefineObjectDemo4 {

	public static void main(String[] args) {
		
		Set<Student> student = new HashSet<Student>();
		student.add(new Student(1, "Shiva"));
		student.add(new Student(2, "Vijay"));
		student.add(new Student(3, "Hemendra"));
		
		System.out.println("name of all students :" + student);
		
		for(Student students : student) {
			System.out.println(students);
		}
		System.out.println("======== Iterate Student in java 8 features");
		student.forEach((stu)-> System.out.println(stu));

	}

}
