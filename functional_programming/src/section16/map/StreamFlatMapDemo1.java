package section16.map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFlatMapDemo1 {

	public static void main(String[] args) {
		// FlatMap code

		List<List<Integer>> listOfList = Arrays.asList(

				Arrays.asList(1, 2, 3), 
				Arrays.asList(4, 5, 6), 
				Arrays.asList(7, 8, 9)

		); //source of stream
		
		Stream<List<Integer>> stream = listOfList.stream(); 
		List<Integer> result = stream.flatMap((list) -> list.stream()).toList();
		System.out.println(result);
		
		System.out.println("==================================================");
		//Collecting nested Array in Single List
		String [][] dataArray = new String[][]{{"a", "b"}, {"c","d"}, {"e","f"}, {"g", "h"}};
		
		Stream<String[]> streamArray = Arrays.stream(dataArray);
		                  List<String> results =  streamArray.flatMap((strArray) -> 
		                    Arrays.stream(strArray)).toList();
		                  System.out.println(results);
	}

}
