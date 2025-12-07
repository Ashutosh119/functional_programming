package Section9.BiFunction;

import java.util.function.BiPredicate;

public class BiPredicateDemo1 {

	public static void main(String[] args) {
		// define a biPredicate check two string or same length or not.
		
		BiPredicate<String, String> sameLength = (str1, str2) -> str1.length() == str2.length();
		System.out.println(sameLength.test("Hello", "Hello"));
		System.out.println(sameLength.test("Hello", "hi"));

	}

}
