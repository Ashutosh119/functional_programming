package Section9.BiFunction;

import java.util.function.BiPredicate;

public class BiPredicateAndDemo2 {

	public static void main(String[] args) {
		// Bi predicate to check if both the number are positive.
		BiPredicate<Integer, Integer> positiveNumbers = (num1, num2) -> num1> 0 && num2 >0;
		
		//check the both numbers are even
		BiPredicate<Integer, Integer> evenNumbers = (num1, num2)-> num1 %2==0 && num2 %2==0;
		
		//using and method
		
		BiPredicate<Integer, Integer> positiveAndEvn = positiveNumbers.and(evenNumbers);
		
		System.out.println(positiveAndEvn.test(4, 6));

	}

}
