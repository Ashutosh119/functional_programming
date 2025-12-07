package section26.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetValueRetrievDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> dayofWeek = new HashSet<String>();
		dayofWeek.add("Monday");
		dayofWeek.add("Tuesday");
		dayofWeek.add("Wednessday");
		dayofWeek.add("Thursday");
		dayofWeek.add("Friday");
		dayofWeek.add("Suturday");
		dayofWeek.add(null);
		System.out.println(dayofWeek);
		//contains method
		if(dayofWeek.contains("Monday")) {
			System.out.println("elements us here");
		} else 
		{
			System.out.println("element not present");
		}
		//checking size
		int elementsize = dayofWeek.size();
		System.out.println("Hash Set element -> " + elementsize);
		
		//isEmpaty
		if(dayofWeek.isEmpty()) {
			System.out.println("elemnt is  empty" );
		} else {
			System.out.println("hash set is not empty");
		}
		

	}

}
