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
	
	public void acceptPayment(Coin coin)
	{
		coins.add(coin);
	}
	
	public Product returnProduct(User wallet, Product nameOfProduct)
	{
		// call the Operator and clear the coins ArrayList before calling this method
		
		Product dust = new Product("Dust", 0.0);
		int coinSum = 0;
		for(int i = 0; i <= coins.size() - 1; i++)
		{
			coinSum += coins.get(i).getValue();
		}
		if(coinSum >= nameOfProduct.getCost())
		{
			products.remove(nameOfProduct);
			return nameOfProduct;
		}
		else
		{
			for(int i = 0; i <= coins.size() - 1; i++)
			{
				Coin temp = coins.get(i);
				wallet.addCoin(temp);
				coins.remove(i);
			}
			return dust;
		}
	}
	
	public void returnCoins(User wallet)
	{
		// not sure if this is a good idea..
		wallet.addCoin(coins.get(0));
	}
}
