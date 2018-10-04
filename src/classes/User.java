package classes;

import java.util.ArrayList;
import java.util.Collections;

public class User {

	private ArrayList<Coin> wallet;
	private ArrayList<Product> purchasedItems;
	private double total;
	
	public User()
	{
		wallet = new ArrayList<Coin>();
		purchasedItems = new ArrayList<Product>();
	}
	
	public double getTotal()
	{
		for(int i = 0; i <= wallet.size() - 1; i++)
		{
			total += wallet.get(i).getValue();
		}
		return total;
	}
	
	public void setTotal(double total)
	{
		this.total = total;
	}
	
	public void clearWallet()
	{
		wallet.clear();
	}
	
	public void addCoin(Coin coin)
	{
		wallet.add(coin);
		total += coin.getValue();
	}
	
	public void removeCoin(Coin coin)
	{
		for(int i = 0; i <= wallet.size() - 1; i++)
		{
			if(wallet.contains(coin))
			{
				total -= wallet.get(i).getValue();
				wallet.remove(coin);
			}
		}
	}
	
	public void sortWallet()
	{
		Collections.sort(wallet);
	}
	
	public void addPurchase(Product nameOfProduct)
	{
		purchasedItems.add(nameOfProduct);
	}
	
	public void removePurchase(Product nameOfProduct)
	{
		purchasedItems.remove(nameOfProduct);
	}
	
	public void clearPurchases()
	{
		purchasedItems.clear();
	}
	
	public String toString()
	{
		String walletString = "Total in wallet: " + total;
		return walletString;
	}
}
