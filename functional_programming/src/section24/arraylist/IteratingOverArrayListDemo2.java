package section24.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingOverArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> programmingLang =new ArrayList<String>();
		programmingLang.add("C");
		programmingLang.add("C++");
		programmingLang.add("Java");
		programmingLang.add("Python");
		programmingLang.add("MySql");
		
		System.out.println("Programmin: " + programmingLang);
		
		//for loop
		for(int i=0; i<programmingLang.size(); i++) {
			System.out.println(programmingLang.get(i));
		}
		System.out.println("======================");
		//for each loop
		for (String language : programmingLang) {
			System.out.println(language);
			
		}
		//USing Iterator
		System.out.println("=========Using Iterator===========");
		Iterator<String> iterator = programmingLang.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("========Java 8 based iterator=====");
		programmingLang.iterator().forEachRemaining((element) ->
		System.out.println(element));
		
		System.out.println("===== for each based iterator=====");
		programmingLang.forEach(element -> System.out.println(element));

	}

}
