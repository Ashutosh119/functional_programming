package section6.functionInterf.predicate;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SuplierGetDemo1 {

	public static void main(String[] args) {
		// define a Supplier that return a constant value
		
		Supplier<String> constantSupllier = ()-> "Hello Supplier function";
		String result = constantSupllier.get();
		System.out.println(result);
		
		//Supplier that return current date and time
		
		Supplier<LocalDateTime> localDateTime = () ->LocalDateTime.now();
		
		LocalDateTime currentDateTime = localDateTime.get();
		System.out.println(currentDateTime);

	}

}
