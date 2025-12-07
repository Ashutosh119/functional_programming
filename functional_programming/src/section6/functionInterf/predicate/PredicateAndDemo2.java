package section6.functionInterf.predicate;

import java.util.function.Predicate;

public class PredicateAndDemo2 {

	public static void main(String[] args) {
		// Predicate And demo code 
		
		//define predicate for checking if a string is not  empty and has more than 5 characters
		Predicate<String> isNotEmpty  = (str) -> !str.isEmpty();
		
		Predicate<String> hasMoreThanFiveChars = (str) -> str.length()> 5;
		
		//combine predicate using and() method
		Predicate<String> isValid = isNotEmpty.and(hasMoreThanFiveChars);
		boolean result = isValid.test("Hello World");
		System.out.println(result);
		
		

	}

}
