package section17.sorted;

import java.util.Arrays;
import java.util.List;

class Product {
	private int id;
	private String name;
	private double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
public class StreamProductSortigDemo4 {

	public static void main(String[] args) {
		// define a product list
		
		List<Product> products = Arrays.asList(
				new Product(1, "Laptop", 50000.99),
				new Product(2, "SmartPhone", 39000.99),
				new Product(3, "Tablet", 45000.99));
		
		List<Product> productList = products.stream().sorted(
				            (p1, p2)-> Double.compare(p1.getPrice(), p2.getPrice())).toList();
		productList.forEach((p) -> System.out.println(p.toString()));
		
		

	}

}
