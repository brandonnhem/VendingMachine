package classes;

public class Coin{	
	private String name;
	private double value;

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
	
	public double getValue()
	{
		return value;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		String coinString = "Coin Type: " + name + " Value: " + value;
		return coinString;
	}
}
