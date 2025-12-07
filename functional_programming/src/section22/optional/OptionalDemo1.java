package section22.optional;

import java.util.Optional;

public class OptionalDemo1 {

	public static void main(String[] args) {
		// of, empty, ofNullable
		
		//1-> empty method
		 
		Optional<Object> emptyValues = Optional.empty();
		System.out.println(emptyValues);
		
		//Null pointer exception
		//of method
	    String emailDetails = "happy@email.com";
		
		Optional<Object>   value  = Optional.of(emailDetails); //print email values

		System.out.println(value); 
		System.out.println(value.get()); //retrieve the value
		
		/*
		String email = null;
		Optional<String> result = Optional.of(email);  //This will throw null pointer exception.
		System.out.println(result); // 
		
		//3-> notnull method
		
		Optional<String> stringValue = Optional.ofNullable(email);
		System.out.println(stringValue); //return empty value optinal.empty
		
		*/
		//real time uses on project
		if(value.isPresent()) {
			System.out.println(value.get());
			}
			else {
				System.out.println("No value is present"); 
		}
		
				

	}

}
