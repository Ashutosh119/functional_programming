package section24.arraylist;

import java.util.ArrayList;
import java.util.List;

public class SearchingElementDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> programmingLang =new ArrayList<String>();
		programmingLang.add("C");
		programmingLang.add("C++");
		programmingLang.add("Java");
		programmingLang.add("Python");
		programmingLang.add("MySql");
		programmingLang.add("java");
		programmingLang.add("MySql");
		
		System.out.println("Programmin: " + programmingLang);
		//check if elements is present in list  | contains() method
		boolean search = programmingLang.contains("Java");
		System.out.println(search);
		
		//find  the index of first occurrence of the element in array list | indexof() method
		int index = programmingLang.indexOf("Java");
		System.out.println("Java element prenst in the index of: " + index);
		
		//find the last index of element  | lastIndex() method
		int lastindex = programmingLang.lastIndexOf("MySql");
		System.out.println(" Last element of the index : " + lastindex);

	}

}
