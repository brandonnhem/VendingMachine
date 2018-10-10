package classes;

public class Product {
	
	private String name;
	private double cost;
	private int quantity;

	public Product()
	{
		this.name = "";
		this.cost = 0.0;
		this.quantity = 0;
	}
	
	public Product(String name, double cost, int quantity)
	{
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}
	
	public Product(Product obj)
	{
		name = obj.getName();
		cost = obj.getCost();
		quantity = 1;
		
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
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	public int getQuantity()
	{
		return quantity;
	}
	
	public String toString()
	{
		String productString = "Name of Product: " + name + " Cost: " + cost
								+ " Quantity: " + quantity;
		return productString;
	}
}
