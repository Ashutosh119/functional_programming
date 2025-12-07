package section26.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorElementDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> languages = new HashSet<String>();
		languages.add("C");
		languages.add("C++");
		languages.add("Java");
		languages.add("Oracle");
		languages.add("Scala");
		
		System.out.println(" Hash Set element :" + languages);
		
		//iterator over enhanced for loop
		for(String iterator : languages) {
			System.out.println("Iterator Value :" + iterator);
		}
		System.out.println("======= Iterating element with Iterator() ========");
		//2 iterator method
		
		Iterator<String> element = languages.iterator();
		while(element.hasNext()) {
			System.out.println(element.next());
		}
		
		//iterator element using java 8
		System.out.println("HashSet element iterator using java 8 based");
		Iterator<String> stringIterator = languages.iterator();
		stringIterator.forEachRemaining((lang) -> System.out.println(lang));
		
		//for each method
		System.out.println(" HashSet element iterat using java 8 foreach method based");
		languages.forEach((languages1) -> System.out.println(languages1));

	}

}
