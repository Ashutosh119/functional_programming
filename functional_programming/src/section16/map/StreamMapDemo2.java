package section16.map;

import java.util.Arrays;
import java.util.List;

public class StreamMapDemo2 {

	public static void main(String[] args) {
		// Convert List of String to list of Integer 
		
		List<String> numbers = Arrays.asList("1","2","3","4","5");
		System.out.println(numbers);
		List<Integer> list = numbers.stream().map((element) -> Integer.valueOf(element)).toList();
		System.out.println(list);

	}

}
