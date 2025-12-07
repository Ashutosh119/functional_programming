package section19.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamForEachDemo1 {

	public static void main(String[] args) {
		// Define a list 
		
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango");
		
		fruits.stream().forEach((f) -> System.out.println(f));
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		numbers.stream().forEach((n)-> System.out.println(n));
		System.out.println("reverse numbers");
		numbers.stream().sorted(Comparator.reverseOrder()).
		                  forEach((nm) -> System.out.println(nm));

	}

}
