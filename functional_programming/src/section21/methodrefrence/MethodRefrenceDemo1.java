package section21.methodrefrence;

import java.util.function.Function;

public class MethodRefrenceDemo1 {

	public static void main(String[] args) {
		// Method Reference
		
		//lambda expression
		Function<Integer, Double> square = (input)-> Math.sqrt(input);
		System.out.println(square.apply(4));
		System.out.println("========= Method Refrence============");

	}

}
