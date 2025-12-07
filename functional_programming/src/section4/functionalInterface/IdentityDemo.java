package section4.functionalInterface;

import java.util.function.Function;

public class IdentityDemo {

	public static void main(String[] args) {
		// identity method is static type
		
		Function<String,  String> function = Function.identity(); // we can used identity method when we print value as its without any changes
	       String result = function.apply("Heloo");
	       System.out.println(result);
		
	}

}
