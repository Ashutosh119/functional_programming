package section23.InterviewPrep;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class FindSecondLargestNumDemo3 {

	public static void main(String[] args) {
		// define a list
		
		List<Integer> number = Arrays.asList(10,20,30,40,50,75,55);
		
		//stream method apply
		Integer secondLrgNm = number.stream()
				.distinct().sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		
		System.out.println("Print 2nd Largets Values :" + secondLrgNm);

	}

}
