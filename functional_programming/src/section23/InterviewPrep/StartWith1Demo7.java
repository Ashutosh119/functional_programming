package section23.InterviewPrep;

import java.util.Arrays;
import java.util.List;

public class StartWith1Demo7 {

	public static void main(String[] args) {
		// define a list
		
		List<Integer> numbers = Arrays.asList(10, 20, 45, 18, 50);
		List<Integer> result = numbers.stream().filter
				   (num -> String.valueOf(num).startsWith("1")).toList();
		System.out.println("All numbers with Start with 1 : " + result);

	}

}
