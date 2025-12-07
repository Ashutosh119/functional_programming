package section23.InterviewPrep;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MaxMinNumberDemo2 {

	public static void main(String[] args) {
		//define a list
		List<Integer>  nums =Arrays.asList(1,2,3,4,5,6,7,8,9);
		//convert into stream object
		//Stream<Integer> stream = nums.stream();
		
		//The max number logic
		
		//int max = stream.mapToInt((num) -> num.intValue()).max().getAsInt();
		
		//System.out.println("orint the max number in the given list: " + max);
		
		System.out.println("=========FIND Minimum Values of The elemenet");
		
		int min = nums.stream().mapToInt(Integer::intValue).min().getAsInt();
		System.out.println(min);

	}

}
