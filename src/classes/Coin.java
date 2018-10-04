package classes;

public class Coin implements Comparable {
	
	private final static double PENNY = 0.01;
	private final static double NICKEL = 0.05;
	private final static double DIME = 0.10;
	private final static double QUARTER = 0.25;
	private final static double DOLLAR = 1.00;
	
	private String name;
	private double value;

	public Coin(String name)
	{
		this.name = name;
		
		if(name.equalsIgnoreCase("PENNY"))
		{
			value = PENNY;
		}
		else if(name.equalsIgnoreCase("NICKEL"))
		{
			value = NICKEL;
		}
		else if(name.equalsIgnoreCase("DIME"))
		{
			value = DIME;
		}
		else if(name.equalsIgnoreCase("QUARTER"))
		{
			value = QUARTER;
		}
		else if(name.equalsIgnoreCase("DOLLAR"))
		{
			value = DOLLAR;
		}
		else
		{
			value = 0.0;
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
	
	public int compareTo(Object otherObject)
	  {
		  Coin otherCoin = (Coin) otherObject;
		  if (getValue() < otherCoin.getValue())
		  {
			  return -1;
		  }
		  if (getValue() > otherCoin.getValue())
		  {
			  return 1;
		  }
		  else
		  {
			  return 0;
		  }
	  }
	
	public String toString()
	{
		String coinString = "Coin Type: " + name + " Value: " + value;
		return coinString;
	}
}
