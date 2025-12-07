package section6.functionInterf.predicate;

import java.util.function.Predicate;

public class PredicateNegateDemo4 {

	public static void main(String[] args) {
		// define a predicate negate method
		//define a empty string
		Predicate<String> isEmpty = str -> str.isEmpty();
		
		//Negate the predicate
		Predicate<String> isNonEmpty = isEmpty.negate();
		boolean result = isNonEmpty.test("Hello");
		
		System.out.println(result);

	}

}
