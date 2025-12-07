package section19.streamApi;

import java.util.Arrays;
import java.util.List;

public class StreamSkipDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer> result = numbers.stream().
				        skip(2).filter(nm-> nm %2==0).limit(3).toList();
		System.out.println(result);

	}

}
