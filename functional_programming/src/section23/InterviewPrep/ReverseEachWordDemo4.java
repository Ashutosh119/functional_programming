package section23.InterviewPrep;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseEachWordDemo4 {

	public static void main(String[] args) {
		// define a String
		
		String input = "hello java programmer";
		
		//convert into char array
		String [] strChar = input.split(" ");
		
		//convert into stream object
		Stream<String> stream = Stream.of(strChar);
		
		String result = stream.map((word) -> 
		                new StringBuilder(word).reverse().toString()
		                ).collect(Collectors.joining(" "));
		System.out.println(result);

	}

}
