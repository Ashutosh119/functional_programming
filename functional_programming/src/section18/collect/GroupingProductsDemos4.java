package section18.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	private String name;
	private String categories;
	public Product(String name, String categories) {
		super();
		this.name = name;
		this.categories = categories;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategories() {
		return categories;
	}
	public void setCategories(String categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", categories=" + categories + "]";
	}
	
}

public class GroupingProductsDemos4 {

	public static void main(String[] args) {
		// Business logic
		
		List<Product> products = Arrays.asList(
				new Product("Jeans", "Cloths"),
				new Product("Mobiles", "Electronics"),
				new Product("Shirts", "Cloths"),
				new Product("Laptops", "Electronics"));
		
		Stream<Product> stream = products.stream();
		
		//Group the products by categories
		Map<String, List<Product>> map = 
				stream.collect(Collectors.groupingBy(Product::getCategories));
		System.out.println(map);
		
		
		

	}

}
