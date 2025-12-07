package section27.hashmap;

import java.util.HashMap;
import java.util.Map;

public class CreateHashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> numberMapping = new HashMap<Integer, String>();
		numberMapping.put(1, "One");
		numberMapping.put(2, "Two");
		numberMapping.put(3, "Three");
		numberMapping.put(null, null);
		numberMapping.put(5, null);
		numberMapping.put(null, null);
		numberMapping.putIfAbsent(4, "Four");
		
		System.out.println(numberMapping);
		

	}

}
