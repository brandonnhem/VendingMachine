package classes;

/**
 * Brandon Nhem
 * Anthony Pham
 * October 10, 2018
 * Purpose: The Product class creates one single item (product) that is to be stored in a VendingMachine and exchanged
 * 			for Coins. A Product has a name, cost, and quantity (how much is to be stored in the VendingMachine.
 * Input: Product(), Product(overloaded), setName(), setCost(), setQuantity()
 * Output: getName(), getCost(), getQuantity, toString()
 */

public class Product {
	
	private String name;
	private double cost;
	private int quantity;
	
	/**
	 * Constructor in which a Product is created with a name, cost, and quantity of 0
	 */

	public Product()
	{
		this.name = "";
		this.cost = 0.0;
		this.quantity = 0;
	}
	
	/**
	 * Constructor in which a Product is created with a name, cost, and quantity
	 * @param name - What the name of the Product will be called
	 * @param cost - The amount the Product should cost
	 * @param quantity - The amount the Product is inside the VendingMachine (or by itself)
	 */
	
	public Product(String name, double cost, int quantity)
	{
		this.name = name;
		this.cost = cost;
		this.quantity = quantity;
	}
	
	/**
	 * Overloaded constructor in which a Product is copied by passing in another Product
	 * @param obj - The Product to be replicated in
	 */
	
	public Product(Product obj)
	{
		name = obj.getName();
		cost = obj.getCost();
		quantity = 1;
	}
	
	/**
	 * Sets the name of the Product
	 * @param name - The name of the Product
	 */
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	/**
	 * Gets the name of the Product
	 * @return The name of the Product
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * Sets the cost of the Product
	 * @param cost - The cost of the Product
	 */
	
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	/**
	 * Gets the cost of the Product
	 * @return The cost of the Product
	 */
	
	public double getCost()
	{
		return cost;
	}
	
	/**
	 * Sets the quantity of the Product
	 * @param quantity - The quantity of the Product
	 */
	
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	
	/**
	 * Gets the quantity of the Product
	 * @return The quantity of the Product
	 */

	public int getQuantity()
	{
		return quantity;
	}
	
	/**
	 * toString method
	 * @return A string of the name of the Product, cost and quantity
	 */
	
	public String toString()
	{
		String productString = "Name of Product: " + name + " Cost: " + cost
								+ " Quantity: " + quantity;
		return productString;
	}
}
