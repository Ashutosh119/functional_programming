package section15.streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamFilteringDemo1 {

	public static void main(String[] args) {
		// Creating a filter method to filter even number from the list
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9); //Source
		
		//Traditional way of filtering even numbers from  a list
		List<Integer> evnNumber = new ArrayList<Integer>();
		for(Integer  number: numbers) {
			if(number % 2==0) {
				evnNumber.add(number);
			}
		}
		System.out.println("Even number : " + evnNumber);
		
		//Streams and filter method...Clean Concise and Sorter
		System.out.println("Even numbers with Stream :"+ numbers.stream().filter(num -> num % 2==0).toList());

	}

}
