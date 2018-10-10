package classes;

import java.util.ArrayList;

public class VendingMachine {
	
	private ArrayList<Product> products;
	private ArrayList<Coin> coins;
	
	public VendingMachine()
	{
		products = new ArrayList<Product>();
		coins = new ArrayList<Coin>();
	}
	
	public void clearProducts()
	{
		// only Operator controls this
		products.clear();
	}
	
	public void clearCoins()
	{
		// only Operator controls this
		coins.clear();
	}
	
	public void addProduct(Product nameOfProduct)
	{
		// only Operator controls this
		products.add(nameOfProduct);
	}
	
	public void removeProduct(Product nameOfProduct)
	{
		products.remove(nameOfProduct);
	}
	
	public int validateCoins(ArrayList<Coin> arr, Product nameOfProduct)
	{
		double coinTotal = 0.0;
		if(products.contains(nameOfProduct) && nameOfProduct.getQuantity() != 0)
		{
			for(int i = 0; i <= arr.size() - 1; i++)
			{
				coinTotal += arr.get(i).getValue();
			}
			if(coinTotal > nameOfProduct.getCost())
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
	
	public void pay(ArrayList<Coin> arr, Product nameOfProduct)
	{
		nameOfProduct.setQuantity(nameOfProduct.getQuantity() - 1);
		for(int i = 0; i <= arr.size() - 1; i++)
		{
			coins.add(arr.get(i));
		}
	}
	
	public String insufficientCoin()
	{
		String noCoins = "Insufficient coins, please add more.";
		return noCoins;
	}
	
	public String outOfQuantity()
	{
		String noProduct = "Out of stock.";
		return noProduct;
	}
	
	public double getVendingTotal()
	{
		double vendingTotal = 0.0;
		for(int i = 0; i <= coins.size() - 1; i++)
		{
			vendingTotal += coins.get(i).getValue();
		}
		return vendingTotal;
	}
	
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
