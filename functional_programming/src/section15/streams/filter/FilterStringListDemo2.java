package section15.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterStringListDemo2 {

	public static void main(String[] args) {
		// 
		
		List<String> fruit = Arrays.asList("Apple", "Banana", "Cherry", "Mango", "Banana");
		
		//Traditional way filtering 
		List<String> filtred = new ArrayList<String>();
		for(String fruits : fruit) {
			if(fruits.equals("Banana")) {
				filtred.add(fruits);
			}
		} System.out.println("Filtered fruirs:" + filtred);
		
		//Filtered Fruits with Streams java 8
		System.out.println(fruit.stream().filter(f-> f.equals("Banana")).toList());
	}
	
	
	


}
