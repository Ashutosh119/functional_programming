package section24.arraylist;

import java.util.ArrayList;
import java.util.List;

public class RemoveElementFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> programmingLang =new ArrayList<String>();
		programmingLang.add("C");
		programmingLang.add("C++");
		programmingLang.add("Java");
		programmingLang.add("Python");
		programmingLang.add("MySql");
		
		System.out.println("Programmin: " + programmingLang);
		
		String removed = programmingLang.remove(1);
		System.out.println("Removed elemenet of index 5 :" + removed );
		System.out.println(programmingLang);
		
		Boolean isRemoved= programmingLang.remove("Python");
		System.out.println("Removed element using object : " + isRemoved);
		System.out.println(programmingLang);
		
		

	}

}
