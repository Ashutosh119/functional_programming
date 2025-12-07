package section15.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class CreateStreamsDemo1 {

	public static void main(String[] args) {
		// 
		
		List<String> fruits = Arrays.asList("Banana", "Mango", "Orange");
		
		Stream<String> stream = fruits.stream(); // create stream from the List
		System.out.println(stream);  //this will return object values
		stream.forEach(System.out::println);
		
		System.out.println(fruits);
		System.out.println("===============Set Creation with Stream =========================");
		System.out.println("Hash Set Implementation...");
		Set<String> set = new HashSet<>(fruits);
		Stream<String> stream1 = set.stream();
		stream1.forEach(System.out::println);
		System.out.println("=================Map Createion with Stream =======================");
		
		//create a map with stream
		Map<String, Integer> fruitsMap = new HashMap<String, Integer>();
		fruitsMap.put("Banana", 1);
		fruitsMap.put("Apple", 2);
		fruitsMap.put("Orange", 3);
		
		Stream<Map.Entry<String, Integer>> mapEntry = fruitsMap.entrySet().stream();
		mapEntry.forEach(System.out::println);
		
		System.out.println("============== Array creation with stream =================");
		
		
		//Create a stream from an Array
		String [] strArray = {"Banana", "Mangoa", "Apple"};
		Stream<String> arrStream = Arrays.stream(strArray);
		arrStream.forEach(System.out::println);
		
		System.out.println("============ new method stream of method===============");
		//create a Stream using stream.of () method
		Stream<String> ofStream = Stream.of("Apple", "Banana", "Mango");
		ofStream.forEach(System.out::println);

	}

}
