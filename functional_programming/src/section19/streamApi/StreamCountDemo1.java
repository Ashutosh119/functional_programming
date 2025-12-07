package section19.streamApi;

import java.util.Arrays;
import java.util.List;

public class StreamCountDemo1 {

	public static void main(String[] args) {
		// Define a list
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango", "Cherry", "Orange");
		
		//count the element
		long counts =fruits.stream().count();
		System.out.println(counts);

	}

}
