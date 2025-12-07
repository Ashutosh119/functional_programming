package section26.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreatedHashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> dayofWeek = new HashSet<String>();
		dayofWeek.add("Monday");
		dayofWeek.add("Tuesday");
		dayofWeek.add("Wednessday");
		dayofWeek.add("Thursday");
		dayofWeek.add("Friday");
		dayofWeek.add("Suturday");
		dayofWeek.add("Sunday");
		
		System.out.println(dayofWeek);
		//Handel duplicate value
		dayofWeek.add("Monday");
		System.out.println(dayofWeek);
		
		//Handel null value
		dayofWeek.add(null);
		dayofWeek.add(null); //ignored
		System.out.println(dayofWeek);
		
		//demonstate insertion order not mentained in hashset
		System.out.println(dayofWeek);
		

	}

}
