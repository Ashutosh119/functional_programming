package section10.Biconsumer;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UniaryOperatorDemo3 {

	public static void main(String[] args) {
		// Define a function..That  square a number
//		Function<Integer, Integer> sqaure = (number)-> number * number;
//		
//		int result = sqaure.apply(2);
//		System.out.println(result);
		
		//unary operaotor
         UnaryOperator<Integer> sqaure = (number)-> number * number;
		
		int result = sqaure.apply(3);
		System.out.println(result);
		
		UnaryOperator<String> toUpperCase = (str)-> str.toUpperCase();
		String res = toUpperCase.apply("Java");
		System.out.println(res);

	}

}
