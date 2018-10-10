package classes;

import java.util.ArrayList;

/**
 * Brandon Nhem
 * Anthony Pham
 * October 10, 2018
 * Purpose: The User class is a glorified ArrayList that just holds Products.
 * Input: addPurchase(), removePurchase(), setItems()
 * Output: clearPurchases(), getItems() toString()
 */

public class User {

	private ArrayList<Product> purchasedItems;
	int items;
	
	/**
	 * Creates an ArrayList of Products
	 */
	
	public User()
	{
		purchasedItems = new ArrayList<Product>();
		this.items = 0;
	}
	
	/**
	 * Adds purchases to the ArrayList of Products
	 * @param nameOfProduct - Said item to be added into the ArrayList of Products
	 */
	
	public void addPurchase(Product nameOfProduct)
	{
		purchasedItems.add(nameOfProduct);
		items++;
	}
	
	/**
	 * Removes purchases from the ArrayList of Products
	 * @param nameOfProduct - Said item to be removed from the ArrayList of Products
	 */
	
	public void removePurchase(Product nameOfProduct)
	{
		purchasedItems.remove(nameOfProduct);
		items--;
	}
	
	/**
	 * Clears the entire ArrayList of Products
	 */
	
	public void clearPurchases()
	{
		purchasedItems.clear();
	}
	
	/**
	 * Sets how many items the User has
	 * @param items - How many items the User should have regardless of have many items are in the ArrayList
	 */
	
	public void setItems(int items)
	{
		this.items = items;
	}
	
	/**
	 * Gets how many items the User has
	 * @return How many items the User has
	 */
	
	public int getItems()
	{
		return items;
	}
	
	/**
	 * toString method
	 * @return A string that shows all the Products purchased from the VendingMachine
	 */
	
	public String toString()
	{
		String walletString = "Items purchased: \n";
		for(int i = 0; i <= purchasedItems.size() - 1; i++)
		{
			walletString += ">>";
			walletString += purchasedItems.get(i).toString();
			walletString += "\n";
		}
		return walletString;
	}
}
