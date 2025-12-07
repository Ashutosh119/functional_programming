package section18.collect;


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountingElementsDemos3 {

	public static void main(String[] args) {
		
		
		System.out.println("Through Stream concept");
		Stream<String> element = Stream.of("Apple", "Banana", "Orange", "Mango");
		long result = element.collect(Collectors.counting());
		System.out.println(result);

	}

}
