package Section9.BiFunction;

import java.util.function.BiPredicate;

public class BiPredicatNegateDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<String, String> isEquals = (str1, str2)-> str1.equals(str2);
		
		//
		BiPredicate<String, String> result = isEquals.negate();
		System.out.println(result.test("hello", "hello"));
		System.out.println(!result.test("hello", "hello"));

	}

}
