package classes;

/**
 * Brandon Nhem
 * Anthony Pham
 * October 10, 2018
 * Purpose: The Coin class is what you would expect a Coin class to be. It is a valued item which has a name and value.
 * Input: Coin(),
 * Output: getValue(), getName(), toString()
 */

public class Coin{	
	private String name;
	private double value;
	
	/**
	 * Constructor class in which a Coin is made with a value and name depending on the value.
	 * @param value - The amount of value in which the coin holds in exchange for a Product
	 */
	
	public Coin(double value)
	{
		this.value = value;
		if(value == 0.01)
		{
			name = "Penny";
		}
		else if(value == 0.05)
		{
			name = "Nickel";
		}
		else if(value == 0.10)
		{
			name = "Dime";
		}
		else if(value == 0.25)
		{
			name = "Quarter";
		}
		else if(value == 1.00)
		{
			name = "Dollar Coin";
		}
		else
		{
			name = "?";
		}
		
	}
	
	/**
	 * Gets the value of the Coin
	 * @return The value of the Coin
	 */
	
	public double getValue()
	{
		return value;
	}
	
	/**
	 * Gets the name of the Coin
	 * @return The name of the Coin
	 */
	
	public String getName()
	{
		return name;
	}
	
	/**
	 * toString method
	 * @return The Coin's name and value
	 */
	
	public String toString()
	{
		String coinString = "Coin Type: " + name + " Value: " + value;
		return coinString;
	}
}
