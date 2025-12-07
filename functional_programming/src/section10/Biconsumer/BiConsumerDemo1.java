package section10.Biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo1 {

	public static void main(String[] args) {
		// Define a BiConsumer 
		
		BiConsumer<String, String> printFullName = (firstName, lastName) -> 
		              System.out.print("FullName : " + firstName + " " + lastName);
		              printFullName.accept("Ramesh", "Kumar");
		              
		              System.out.println("print email and password");
		              
		              BiConsumer<String, String> emailPass = (email, password)-> {
		            	  System.out.println("Email :" + email);
		            	  System.out.println("Password :" + password);
		              };
		              emailPass.accept("rms@hotmail.com", "hotmail");
		            	  
		            	  
		                  
		             
	}

}
