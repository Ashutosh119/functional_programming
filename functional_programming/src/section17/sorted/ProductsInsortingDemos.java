package section17.sorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class ProductName{
	private int id;
	private String name;
	private double price;
	public ProductName(int id, String name, double price) {
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
		return "ProductName [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
public class ProductsInsortingDemos {

	public static void main(String[] args) {
		// Define a products list
		
		List<ProductName> products1 = Arrays.asList(
				new ProductName(1, "LG", 51000.99),
				new ProductName(2, "Tablet", 39999.99),
				new ProductName(2, "Samsung Tv", 39999.99),
				new ProductName(3, "Dell Laptop", 65000.99));
		
		//sort by price in ascending order
		List<ProductName> productsList1 = products1.stream()
				          .sorted((ps1, ps2)-> Double.compare(ps1.getPrice(), ps2.getPrice())).toList();
		productsList1.forEach((ps)-> System.out.println(ps.toString()));
		
		System.out.println("Decending order details in .......");
		List<ProductName> productDescendingOrder = products1.stream()
                .sorted(Comparator.comparingDouble(ProductName::getPrice).reversed())
                .toList();
		productDescendingOrder.forEach((pd1)-> System.out.println(pd1.toString()));;
		
		//If price is same we can sort products 
		System.out.println("=================================================");
		List<ProductName> productNameSorting = products1.stream().sorted(
				Comparator.comparing(ProductName::getPrice).thenComparing(ProductName::getName)).toList();
		productNameSorting.forEach((pds)-> System.out.println(pds.toString()));

	}

}
