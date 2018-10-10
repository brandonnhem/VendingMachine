package classes;

/**
 * Brandon Nhem
 * Anthony Pham
 * October 10, 2018
 * Purpose: The Operator class is to control if items should be restocked or the cash to be emptied out of the VendingMachine
 * Input: restock(), emptyCash()
 * Output: toString()
 */

public class Operator {
		
	/**
	 * Restocks a certain item that is passed through the arguments
	 * @param machine - The machine that is to be restocked
	 * @param nameOfProduct - The Product that is to be restocked
	 * @param quantity - How much the Product should be restocked
	 */
	
	public void restock(VendingMachine machine, Product nameOfProduct, int quantity)
	{
		machine.removeProduct(nameOfProduct);
		Product temp = new Product(nameOfProduct);
		temp.setQuantity(quantity);
		machine.addProduct(temp);
	}
	
	/**
	 * Clears out the Coins from the VendingMachin
	 * @param machine - Which machine to empty out the Coins from
	 */
	
	public void emptyCash(VendingMachine machine)
	{
		machine.clearCoins();
	}
	
	/**
	 * toString method
	 * @return A string in which the Operator explains their job
	 */
	
	public String toString()
	{
		String operatorString = "I'm the operator, it's my job to empty the cash "
								+ "out of the vending machine and restock items!";
		return operatorString;
	}
}
