package Section9.BiFunction;

import java.util.function.BiPredicate;

public class BiPredicateDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BiPredicate<Integer, Integer> evenNum = (num1, num2)-> num1 %2==0 && num2  %2==0;
		
		//BiPredicate<Integer, Integer> evenNumbers = (num1, num2)-> num1 %2==0 && num2 %2==0;
		
		System.out.println(evenNum.test(4, 6));  //true
		System.out.println(evenNum.test(9, 2));  //false
		
		//or method
		BiPredicate<Integer, Integer> ormethods = evenNum.or(evenNum);
		System.out.println(ormethods.test(2, -3));
		System.out.println(ormethods.test(2, 6));

	}

}
