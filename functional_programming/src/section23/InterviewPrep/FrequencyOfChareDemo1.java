package section23.InterviewPrep;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyOfChareDemo1 {

	public static void main(String[] args) {
		// Given String
		
		String input ="Hello World";
		IntStream stream = input.chars();
		//map with key pair values
		
		Map<Character, Long> mapping = stream.mapToObj((c)-> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()
						)
					);
				System.out.println(mapping);

	}

}
