package section6.functionInterf.predicate;

import java.util.function.Consumer;

public class PrintConsumerDemo1 {

	public static void main(String[] args) {
		// Define a Consumer that print a String
		Consumer<String> printConsumer = str -> System.out.println(str);
		
		printConsumer.accept("Hello Consumer Interface");
		
		//define another consumer that convert the input to UpperCase
		Consumer<String> upperCaseConsumer = (str) -> System.out.println("UpperCase :" + str.toUpperCase());
		
		Consumer<String> result = printConsumer.andThen(upperCaseConsumer);
		result.accept("Hello");
		
		//System.out.println("Hello");

	}

}
