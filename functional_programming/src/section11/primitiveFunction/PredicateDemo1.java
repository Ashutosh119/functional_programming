package section11.primitiveFunction;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		//Define a predicate function
		Predicate<Integer> isEven = (num)-> num%2==0;
		System.out.println(isEven.test(10));
		System.out.println(isEven.test(9));
		
		System.out.println(" ================== ");
		
		IntPredicate isEvnNum = (num1) -> num1 % 2 == 0;
		System.out.println(isEvnNum.test(8));
		System.out.println(isEvnNum.test(5));

	}

}
