package section19.streamApi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Product{
	private String name;
	private double price;
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + "]";
	}
	
	
	
}

public class StreamCountFilterDemo2 {

	public static void main(String[] args) {
		// define a 
		
		List<Product> product = Arrays.asList(
				new Product("Laptop", 51000),
				new Product("Monitor", 35000),
				new Product("Smartwatch", 25000),
				new Product("SmartPhone", 30000),
				new Product("Electronics", 40000));
		
		     long productCount = product.stream().filter(p -> p.getPrice() > 30000).count();
		     System.out.println(productCount);
		     
		     List<Product> list = product.stream().filter(p1 -> p1.getPrice() > 30000).toList();
		     System.out.println(list);

	}

}
