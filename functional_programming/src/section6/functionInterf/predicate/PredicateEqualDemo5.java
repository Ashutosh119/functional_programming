package section6.functionInterf.predicate;

import java.util.function.Predicate;

public class PredicateEqualDemo5 {

	public static void main(String[] args) {
		//predicate to check if the input equals "java"
		
		Predicate<String> isJava = Predicate.isEqual("Java");
		
		boolean result = isJava.test("Java");
		System.out.println(result);

	}

}
