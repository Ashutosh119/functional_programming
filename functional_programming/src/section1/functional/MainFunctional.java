package section1.functional;

import java.util.Arrays;
import java.util.List;

class FunctionalDemo{
	public static int sumcalculation(List<Integer> numbers) {
		
		return numbers.stream().filter(num -> num % 2 == 0)
				.mapToInt(num -> num)
				.sum();
	}
}

public class MainFunctional {

	public static void main(String[] args) {
		// 
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		System.out.println(FunctionalDemo.sumcalculation(numbers));

	}

}
