package classes;

public class Product {
	
	private String name;
	private double cost;

	public Product()
	{
		this.name = "";
		this.cost = 0.0;
	}
	
	public Product(String name, double cost)
	{
		this.name = name;
		this.cost = cost;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	public double getCost()
	{
		return cost;
	}
	
	public String toString()
	{
		String productString = "Name of Product: " + name + " Cost: " + cost;
		return productString;
	}
}
