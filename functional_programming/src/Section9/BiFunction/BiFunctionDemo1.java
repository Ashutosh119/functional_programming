package Section9.BiFunction;

import java.util.function.BiFunction;

public class BiFunctionDemo1 {

	public static void main(String[] args) {
		// Define a BiFunction  to add number
		
		BiFunction<Integer, Integer, Integer> addNumber = (num1 , num2) -> num1 + num2;
		    int result = addNumber.apply(10, 11);
		    System.out.println(result);

	}

}
