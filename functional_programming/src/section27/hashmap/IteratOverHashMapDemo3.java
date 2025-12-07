package section27.hashmap;

import java.util.HashMap;
import java.util.Map;

public class IteratOverHashMapDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> fruits = new HashMap<String, Integer>();
		fruits.put("Apple", 10);
		fruits.put("Banana", 20);
		fruits.put("Orange", 30);
		
		fruits.forEach((key, value) -> System.out.println(key + " -> " + value));

	}

}
