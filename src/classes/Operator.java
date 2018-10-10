package classes;

public class Operator {
		
	public void restock(VendingMachine machine, Product nameOfProduct, int quantity)
	{
		machine.removeProduct(nameOfProduct);
		Product temp = new Product(nameOfProduct);
		temp.setQuantity(quantity);
		machine.addProduct(temp);
	}
	
	public void emptyCash(VendingMachine machine)
	{
		machine.clearCoins();
	}
	
	public String toString()
	{
		String operatorString = "I'm the operator, it's my job to empty the cash "
								+ "out of the vending machine and restock items!";
		return operatorString;
	}
}
