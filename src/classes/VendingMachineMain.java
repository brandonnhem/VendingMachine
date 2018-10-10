package classes;

import java.util.ArrayList;

public class VendingMachineMain {

	public static void main(String[] args) {
		
		/**
		 * Constructor methods for all classes except coins
		 */
		
		VendingMachine machine = new VendingMachine();
		User purchases = new User();
		ArrayList<Coin>coins = new ArrayList<Coin>();
		Operator op = new Operator();
		
		/**
		 * Creating Products Section
		 */
		
		Product lays, doritos, cheetos;
		lays = new Product("Lays", 1.25, 3);
		doritos = new Product("Doritos", 1.25, 3);
		cheetos = new Product("Cheetos", 1.25, 0);
		
		Product chocolateBar, chocolateCookie, gum;
		chocolateBar = new Product("Crunch", 0.65, 3);
		chocolateCookie = new Product("Chocolate Cookie", 1.05, 2);
		gum = new Product("Mint", 0.75, 5);
		
		Product coke, gatorade, juice;
		coke = new Product("Coke", 1.55, 3);
		gatorade = new Product("Gatorade", 1.75, 4);
		juice = new Product("Juice", 1.55, 5);
		
		/**
		 * Testing addProduct and removeProduct
		 */
		
		machine.addProduct(gum);
		machine.removeProduct(gum);
		machine.addProduct(gum);

		machine.addProduct(chocolateCookie);
		machine.removeProduct(chocolateCookie);
		machine.addProduct(chocolateCookie);
		
		machine.addProduct(chocolateBar);
		machine.removeProduct(chocolateCookie);
		machine.addProduct(chocolateCookie);

		machine.addProduct(cheetos);
		machine.removeProduct(chocolateCookie);
		machine.addProduct(chocolateCookie);
		
		machine.addProduct(doritos);
		machine.removeProduct(chocolateCookie);
		machine.addProduct(chocolateCookie);
		
		machine.addProduct(lays);
		machine.removeProduct(chocolateCookie);
		machine.addProduct(chocolateCookie);
		
		machine.addProduct(juice);
		machine.removeProduct(chocolateCookie);
		machine.addProduct(chocolateCookie);
		
		machine.addProduct(gatorade);
		machine.removeProduct(chocolateCookie);
		machine.addProduct(chocolateCookie);
		
		machine.addProduct(coke);
		machine.removeProduct(chocolateCookie);
		machine.addProduct(chocolateCookie);
		
		/**
		 * Constructor method for coins
		 */
		
		Coin dollar = new Coin(1.00);
		Coin quarter = new Coin(0.25);
		Coin quarter1 = new Coin(0.25);
		Coin quarter2 = new Coin(0.25);
		Coin quarter3 = new Coin(0.25);
		Coin dime = new Coin(0.10);
		Coin dime1 = new Coin(0.10);
		Coin dime2 = new Coin(0.10);
		Coin dime3 = new Coin(0.10);
		Coin nickel = new Coin(0.05);
		Coin nickel1 = new Coin(0.05);
		Coin nickel2 = new Coin(0.05);
		Coin nickel3 = new Coin(0.05);
		Coin penny = new Coin(0.01);
		
		coins.add(quarter);
		coins.add(quarter1);
		coins.add(quarter2);
		coins.add(quarter3);
		coins.add(dollar);
		coins.add(dime);
		coins.add(dime1);
		coins.add(dime2);
		coins.add(dime3);
		coins.add(nickel);
		coins.add(nickel1);
		coins.add(nickel2);
		coins.add(nickel3);
		coins.add(penny);
		
		System.out.println(machine);
		
		double coinTotal = 0.0;
		
		for(int i = 0; i <= coins.size() - 1; i++)
		{
			coinTotal += coins.get(i).getValue();
		}
		
		if(machine.validateCoins(coins, gum) == 1)
		{
			System.out.print("You inserted ");
			System.out.printf("%,.2f%n", coinTotal);
			coins.clear();

			Product temp = new Product(gum);
			purchases.addPurchase(temp);
			System.out.println("Thank you for purchasing " + gum.getName() + " for " + gum.getCost());
		}
		else if(machine.validateCoins(coins, gum) == 0)
		{
			System.out.print("You inserted ");
			System.out.printf("%,.2f", coinTotal);
			System.out.print(" for " + gum.getName());
			System.out.println(machine.insufficientCoin());
		}
		else if(machine.validateCoins(coins, gum) == -1)
		{
			System.out.print("You inserted ");
			System.out.printf("%,.2f", coinTotal);
			System.out.print(" for " + gum.getName());
			System.out.println(machine.outOfQuantity());
		}
		
		/**
		 * Demonstrating to buy a product out of stock
		 */
		
		Coin dollar5 = new Coin(1.00);
		coins.add(dollar5);
		
		coinTotal = 0.0;
		for(int i = 0; i <= coins.size() - 1; i++)
		{
			coinTotal += coins.get(i).getValue();
		}
		
		if(machine.validateCoins(coins, cheetos) == 1)
		{
			System.out.print("You inserted ");
			System.out.printf("%,.2f%n", coinTotal);
			coins.clear();

			Product temp = new Product(cheetos);
			purchases.addPurchase(temp);
			System.out.println("Thank you for purchasing " + cheetos.getName() + " for " + cheetos.getCost());
		}
		else if(machine.validateCoins(coins, cheetos) == 0)
		{
			System.out.print("You inserted ");
			System.out.printf("%,.2f", coinTotal);
			System.out.println(" for " + cheetos.getName());
			System.out.println(machine.insufficientCoin());
		}
		else if(machine.validateCoins(coins, cheetos) == -1)
		{
			System.out.print("You inserted ");
			System.out.printf("%,.2f", coinTotal);
			System.out.println(" for " + cheetos.getName());
			System.out.println(machine.outOfQuantity());
		}
		
		/**
		 * Trying to buy a coke with insufficient coins
		 */
			
		if(machine.validateCoins(coins, coke) == 1)
		{
			System.out.print("You inserted ");
			System.out.printf("%,.2f%n", coinTotal);
			coins.clear();

			Product temp = new Product(coke);
			purchases.addPurchase(temp);
			System.out.print("Thank you for purchasing " + coke.getName() + " for ");
			System.out.printf("%,.2f%n", coke.getCost());

		}
		else if(machine.validateCoins(coins, coke) == 0)
		{
			System.out.print("You inserted ");
			System.out.printf("%,.2f", coinTotal);
			System.out.println(" for " + coke.getName());

			System.out.println(machine.insufficientCoin());
		}
		else if(machine.validateCoins(coins, coke) == -1)
		{
			System.out.print("You inserted ");
			System.out.printf("%,.2f", coinTotal);
			System.out.println(" for " + coke.getName());
			System.out.println(machine.outOfQuantity());
		}
		
		System.out.println("\n" + machine);
		System.out.println(op);
		double cash = machine.getVendingTotal();
		op.emptyCash(machine);
		System.out.printf("%,.2f", cash);
		System.out.println(" worth of coins taken out of the machine");
		System.out.println("I'll also restock those Cheetos!");
		op.restock(machine, cheetos, 4);
		System.out.print("\n" + machine);
		
		System.out.println("\nUser has bought " + purchases);
		

	}

}
