package section25.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class CreateLinkedlistdemo1 {

	public static void main(String[] args) {
		//Create a LinkedList
		
		List<String> fruits = new LinkedList<String>();
		
		//add() - Add new element to the end of LinkedList
		fruits.add("Apple"); //0
		fruits.add("Banana"); //1
		fruits.add("Cherry");  //2
		
		System.out.println("Linked List after add : " + fruits);
		
		// add(index, element) - Add an element at the specified position in index
		fruits.add(1, "Mango");
		System.out.println("Index view after adding new element: " + fruits);
		
		//first (index. element) method
		System.out.println("============ first ==========");
		
		
		
		

	}

}
