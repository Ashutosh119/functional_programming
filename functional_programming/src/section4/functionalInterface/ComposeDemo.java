package section4.functionalInterface;

import java.util.function.Function;

public class ComposeDemo {

	public static void main(String[] args) {
		
		//define a function that trims a string
		Function<String, String> trim = (str) -> str.trim();
		System.out.println(trim.apply("  hello  "));
		
		//define another function 
		
		Function<String, String> toUpperCase = (str)-> str.toUpperCase();
		System.out.println(toUpperCase.apply("  Hello  "));
		
		//compose the two function
		Function<String, String> trimTheupperCase = toUpperCase.compose(trim);
		String result = trimTheupperCase.apply("  hello   ");
		System.out.println(result);
		

	}

}
