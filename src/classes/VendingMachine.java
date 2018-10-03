package classes;

import java.util.ArrayList;

public class VendingMachine {
	
	private ArrayList<Product> products;
	
	public VendingMachine()
	{
		products = new ArrayList<Product>();
	}
	
	public void addProduct(Product nameOfProduct)
	{
		products.add(nameOfProduct);
	}
	
	public Product returnProduct(Product nameOfProduct)
	{
		// find nameOfProduct in ArrayList, return Product
		Product returnProduct = new Product();
		for(int i = 0; i <= products.size() - 1; i++)
		{
			if(products.get(i).equals(nameOfProduct))
			{
				return nameOfProduct;
			}
		}
		returnProduct = nameOfProduct;
		return returnProduct;
	}
	
	
}
