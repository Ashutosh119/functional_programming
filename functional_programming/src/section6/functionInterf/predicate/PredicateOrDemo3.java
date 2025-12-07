package section6.functionInterf.predicate;

import java.util.function.Predicate;

public class PredicateOrDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//predicate to check if a number is less than 5;
		Predicate<Integer> isLessThanFive = num -> num < 5;
		
		//predicate to check if a number is greater than 15;
		Predicate<Integer> isGreaterThanfifteen = num -> num > 15;
		
		//combine predicate using or() method
		Predicate<Integer> result = isLessThanFive.or(isGreaterThanfifteen);
		System.out.println(result.test(21));
		

	}

}
