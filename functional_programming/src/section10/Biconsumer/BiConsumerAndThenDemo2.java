package section10.Biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerAndThenDemo2 {

	public static void main(String[] args) {
		// define a BiConsumer and add the number.
		
		BiConsumer<Integer, Integer> printNumber = (num1, num2) ->
		               System.out.println("Add two numbers :" + num1 + ", " + num2);
		
		               // define a sum number after adding
		               BiConsumer<Integer, Integer> sum = 
		            		   (num1, num2)-> System.out.println("sum : " + (num1 +  num2));
		            		   BiConsumer<Integer,Integer> result = printNumber.andThen(sum);
		            		   result.accept(11, 20);
		            		   

	}

}
