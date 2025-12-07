package section4.functionalInterface;

import java.util.function.Function;

public class AndThenDemo {

	public static void main(String[] args) {
		
		//define a function that calculates the length of the string
		Function<String ,  String> toUpperCase = str -> str.toUpperCase();
		
		//define another function that calculates the length of a string
		Function<String, Integer> stringLength = str -> str.length();
		
		Function<String, Integer> upperCaseThenLength = toUpperCase.andThen(stringLength);
		int length =upperCaseThenLength.apply("Ramesh");
		System.out.println("AndThen :" + length);

	}

}
