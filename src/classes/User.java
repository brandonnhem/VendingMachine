package classes;

import java.util.ArrayList;

public class User {

	private ArrayList<Product> purchasedItems;
	int items;
	
	public User()
	{
		purchasedItems = new ArrayList<Product>();
		this.items = 0;
	}
	
	public void addPurchase(Product nameOfProduct)
	{
		purchasedItems.add(nameOfProduct);
		items++;
	}
	
	public void removePurchase(Product nameOfProduct)
	{
		purchasedItems.remove(nameOfProduct);
		items--;
	}
	
	public void clearPurchases()
	{
		purchasedItems.clear();
	}
	
	public void setItems(int items)
	{
		this.items = items;
	}
	
	public int getItems()
	{
		return items;
	}
	
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
