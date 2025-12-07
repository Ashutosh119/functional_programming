package section15.streams.filter;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Optional<Integer> minNumbr = numbers.stream().min((o1, o2) -> o1.compareTo(o2));
		System.out.println(minNumbr);

	}

}
