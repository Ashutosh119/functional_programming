package section19.streamApi;

import java.util.Arrays;
import java.util.List;


public class StreamMaxDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int max = numbers.stream().max((o1, o2)-> o1.compareTo(o2)).get();
		System.out.println(max);

	}

}
