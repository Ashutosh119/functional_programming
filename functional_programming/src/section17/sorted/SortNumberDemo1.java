package section17.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class SortNumberDemo1 {

	public static void main(String[] args) {
		// Define a sorted method to sort element of given List
		
		List<Integer> element = Arrays.asList(1,2,6,3,0,8,5,4,9);
		List<Integer> number =element.stream().sorted().toList();
		System.out.println(number);
		System.out.println("even series...");
		//filter method find even numbers
		List<Integer> evn = element.stream().filter(even-> even %2==0).sorted().toList();
		System.out.println("even numbers ins sorted way : " + evn);
		
		System.out.println("=====================================");
		//sort order in decending order
List<Integer> result1 = element.stream().sorted(Comparator.reverseOrder()).toList();
System.out.println(result1);
	}
	
	

}
