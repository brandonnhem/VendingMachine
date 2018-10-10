package classes;

/*  Brandon Nhem
	Anthony Pham
	October 10, 2019
	Purpose: This is the VendingMachine class, it handles the transactions and any Products that are inside of it. 
	Inputs: addProduct(), removeProduct(), validateCoins(), pay()
	Outputs: validateCoins(), getVendingTotal(), insufficientCoin(), outOfQuantity(), toString()
*/

import java.util.ArrayList;

public class VendingMachine {
	
	private ArrayList<Product> products;
	private ArrayList<Coin> coins;
	
	/**
	 * Constructor class creates two ArrayLists. One holds Coins and the other holds Products.
	 */
	
	public VendingMachine()
	{
		products = new ArrayList<Product>();
		coins = new ArrayList<Coin>();
	}
	
	/**
	 * Empties the ArrayList of Products
	 */
	
	public void clearProducts()
	{
		// only Operator controls this
		products.clear();
	}
	
	/**
	 * Empties the ArrayList of Coins
	 */
	
	public void clearCoins()
	{
		// only Operator controls this
		coins.clear();
	}
	
	/**
	 * Adds a Product to the ArrayList of Products
	 * @param nameOfProduct - the product to be passed in and added
	 */
	
	public void addProduct(Product nameOfProduct)
	{
		// only Operator controls this
		products.add(nameOfProduct);
	}
	
	/**
	 * Removes a Product from the ArrayList of Products
	 * @param nameOfProduct - the product to be passed in and removed
	 */
	
	public void removeProduct(Product nameOfProduct)
	{
		products.remove(nameOfProduct);
	}
	
	/**
	 * Validates that there is enough stock of the Product being purchased and that is in the VendingMachine.
	 * After validating that there is Product in the VendingMachine, it then checks if there are enough Coins
	 * to purchase the Product. 
	 * @param arr - The ArrayList being passed in of Coins
	 * @param nameOfProduct - Product to be purchased
	 * @return  1 - If the Product is in stock, in the VendingMachine, and there's enough Coins
	 * @return  0 - If the Product is in stock, in the VendingMachine, but there's not enough Coins
	 * @return -1 - If the Product is not in stock or in the VendingMachine
	 */
	
	public int validateCoins(ArrayList<Coin> arr, Product nameOfProduct)
	{
		double coinTotal = 0.0;
		if(products.contains(nameOfProduct) && nameOfProduct.getQuantity() != 0)
		{
			for(int i = 0; i <= arr.size() - 1; i++)
			{
				coinTotal += arr.get(i).getValue();
			}
			if(coinTotal >= nameOfProduct.getCost())
			{
				pay(arr, nameOfProduct);
				return 1;
			}
			else
			{
				// not enough coins
				return 0;
			}
		}
		else
		{
			// no product available 
			return -1;
		}
	}
	
	/**
	 * Reduces the quantity of the Product being purchased by one and adding the Coins into the VendingMachine
	 * @param arr - The ArrayList of Coins to take the Coins from
	 * @param nameOfProduct - The name of the Product in which is being purchased
	 */
	
	public void pay(ArrayList<Coin> arr, Product nameOfProduct)
	{
		nameOfProduct.setQuantity(nameOfProduct.getQuantity() - 1);
		for(int i = 0; i <= arr.size() - 1; i++)
		{
			coins.add(arr.get(i));
		}
	}
	
	/**
	 * Error message for insufficient Coins
	 * @return A string if there is not enough Coins
	 */
	
	public String insufficientCoin()
	{
		String noCoins = "Insufficient coins, please add more.";
		return noCoins;
	}
	
	/**
	 * Error message for lack of quantity from the Product
	 * @return A string if there is no Product or is out of stock
	 */
	
	public String outOfQuantity()
	{
		String noProduct = "Out of stock.";
		return noProduct;
	}
	
	/**
	 * Gets the total of Coins the VendingMachine has
	 * @return vendingTotal - The number of Coins the VendingMachine has
	 */
	
	public double getVendingTotal()
	{
		double vendingTotal = 0.0;
		for(int i = 0; i <= coins.size() - 1; i++)
		{
			vendingTotal += coins.get(i).getValue();
		}
		return vendingTotal;
	}
	
	/**
	 * Overriding the toString method in which the VendingMachine will display all the Products it has
	 */
	
	public String toString()
	{
		String productsString = "Products for sale: \n";
		for(int i = 0; i <= products.size() - 1; i++)
		{
			productsString += products.get(i).toString();
			productsString += "\n";
		}
		return productsString;
	}
}
