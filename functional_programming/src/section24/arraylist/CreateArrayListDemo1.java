package section24.arraylist;

import java.util.ArrayList;
import java.util.List;

public class CreateArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>animal = new ArrayList<String>();
		animal.add("Lion");
		animal.add("Tiger");
		animal.add("Cat");
		animal.add("Dog");
		System.out.println(animal);
		animal.add(2, "Elephant");
		System.out.println(animal);

	}

}
