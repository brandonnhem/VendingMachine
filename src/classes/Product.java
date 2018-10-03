package classes;

public class Product {
	
	private String name;
	private double price;

	public Product()
	{
		this.name = "";
		this.price = 0.0;
	}
	
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	
	public String toString()
	{
		String product = "Name: " + name + " Price: " + price;
		return product;
	}
}
