package section19.streamApi;

import java.util.Arrays;
import java.util.List;

public class StreamDistnictDemo2 {

	public static void main(String[] args) {
		
		List<String> fruits = Arrays.asList("Apple","Banana", "Mango", "Apple", "Banana");
		
		List<String> result = fruits.stream().distinct().toList();
		System.out.println(result);

	}

}
