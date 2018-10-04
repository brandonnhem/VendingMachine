package classes;

public class Operator extends User {
		
	public void restock(VendingMachine machine, Product nameOfProduct)
	{
		machine.addProduct(nameOfProduct);
	}
	
	public void emptyCash(VendingMachine machine)
	{
		machine.clearCoins();
	}
}
