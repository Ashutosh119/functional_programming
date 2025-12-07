package section15.streams.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{
	private String name;
	private double price;
	private String category;
	public Product(String name, double price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
	
	
}
public class FilterCustomObject {

	public static void main(String[] args) {
		List<Product> product = new ArrayList<Product>(); //Source
		product.add(new Product("Phone", 999.99, "Electronics"));
		product.add(new Product("Shorts", 99.99, "Clothing"));
		product.add(new Product("TV", 1999.99, "Electronics"));
		product.add(new Product("Laptop", 2999.99, "Electronics"));
		product.add(new Product("Jeans", 990.99, "Clothing"));
		
		//Create Stream from List (Source)
		
		Stream<Product> stream = product.stream();
		//filtering only define category like electronics / clothing extra..
		List<Product> filterProduct = stream.filter(pro-> pro.getCategory().equals("Electronics"))
				.filter(pro -> pro.getPrice() >800).toList();
		//System.out.println(filterProduct);
		
		filterProduct.forEach((product1) -> {
			System.out.println(product1.toString());
		});
		
		System.out.println("Filterring products by price all products :");
		List<Product> res = product.stream().filter(pr-> pr.getPrice() > 800).collect(Collectors.toList());
		System.out.print(res);
		
		
		

	}

}
