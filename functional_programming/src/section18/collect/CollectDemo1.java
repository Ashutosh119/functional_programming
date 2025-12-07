package section18.collect;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectDemo1 {

	public static void main(String[] args) {
		// Collect method demos code
		
		Stream<String> stream = Stream.of("Banan", "Apple", "Orange");
		List<String> result = stream.collect(Collectors.toList());
		System.out.println(result);
		
		System.out.println("--------------------------------------------------------");
		Stream<String> stream1 = Stream.of("Banan", "Apple", "Orange", "Banana");
		Set<String> result1 = stream1.collect(Collectors.toSet());
		System.out.println(result);

	}

}
