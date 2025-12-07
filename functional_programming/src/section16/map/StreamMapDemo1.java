package section16.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMapDemo1 {

	public static void main(String[] args) {
		// Define a list
		
		List<String> fruit = Arrays.asList("Apple", "Mango", "Banana", "Chery", "Orange");
		
		Stream<String> fruitsMap = fruit.stream();
		
		List<String> list = fruitsMap.map((fmap)-> fmap.toUpperCase()).toList();
		System.out.println(list);

	}

}
