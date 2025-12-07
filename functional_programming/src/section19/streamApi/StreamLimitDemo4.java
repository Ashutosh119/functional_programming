package section19.streamApi;

import java.util.Arrays;
import java.util.List;

public class StreamLimitDemo4 {

	public static void main(String[] args) {
		// define a list
		
		List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Mango", "Orange");
		    //convert to stream object
		                List<String> result=fruits.stream().limit(3).toList();
		                System.out.println(result);
		                
		                //Print first 5 even number from the list
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10, 11, 12, 13,14,15);
		List<Integer> evenNum = numbers.stream().filter(num -> num %2 ==0).limit(5).toList();
		System.out.println("first five even numbers :" + evenNum);

	}

}
