package section17.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> fruits = Arrays.asList("Apple", "Orange", "Mango", "Cherry", "Banana");
		List<String> result = fruits.stream().sorted().toList();
		System.out.println(result);
		
		System.out.println("Reverse Order.............");
		List<String> reverseSeries = fruits.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(reverseSeries);

	}

}
