package section27.hashmap;

import java.util.HashMap;
import java.util.Map;

public class RetrivingValueHashMapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> fruits = new HashMap<String, Integer>();
		fruits.put("Apple", 10);
		fruits.put("Banana", 20);
		fruits.put("Orange", 30);
		
		System.out.println(" Hash Map values :" + fruits);
		if(fruits.containsValue(20)) {
			System.out.println("Hash Map have Values present");
		} else {
			System.out.println("no value is present");
		}
		
		Integer count = fruits.get("Apple");
		System.out.println(count);

	}

}
