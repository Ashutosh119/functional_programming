package section6.functionInterf.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//predicate to check if a number is greater than 10
		
		Predicate<Integer> isGreaterThanTen =num -> num > 10;
		boolean result = isGreaterThanTen.test(15);
		System.out.println(result);
		
		

	}

}
