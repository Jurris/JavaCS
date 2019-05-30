import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int numberOfPeopleAtParty;
		int numberOfSlicesPerPerson;
		int numberOfSlicesPerPizza;
		double costOfEachPizza;
		double amountChargedCustomerForEachPizza;

		System.out.print("Enter the number of people at the party ");
		numberOfPeopleAtParty = stdin.nextInt();
		System.out.print("Enter the number of slices for each person ");
		numberOfSlicesPerPerson = stdin.nextInt();
		System.out.print("Enter the number of slices per pizza ");
		numberOfSlicesPerPizza = stdin.nextInt();
		System.out.print("Enter the cost of each pizza ");
		costOfEachPizza = stdin.nextFloat();
		System.out.print("Enter the ammount charged to the customer ");
		amountChargedCustomerForEachPizza = stdin.nextFloat();

		calcCustomerInvoiceReport(numberOfPeopleAtParty,
				numberOfSlicesPerPerson, numberOfSlicesPerPizza,
				amountChargedCustomerForEachPizza);
		calcCatererProfitReport(amountChargedCustomerForEachPizza,
				numberOfPeopleAtParty, numberOfSlicesPerPerson,
				numberOfSlicesPerPizza, costOfEachPizza);
	}

	public static void calcCustomerInvoiceReport(int numberOfPeopleAtParty,
			int numberOfSlicesPerPerson, int numberOfSlicesPerPizza,
			double amountChargedCustomerForEachPizza) {

		int pizzasRequired = (numberOfPeopleAtParty * numberOfSlicesPerPerson)
				/ numberOfSlicesPerPizza;
		int sliceYield = pizzasRequired / numberOfSlicesPerPizza;
		float customerCostForParty = (float) (pizzasRequired * amountChargedCustomerForEachPizza);
		System.out.println("\nCustomer Invoice Report\nThe party will require "
				+ pizzasRequired + " pizzas yielding " + sliceYield
				+ " slices." + "\nThe customer cost for the party is $"
				+ customerCostForParty + ".");

	}

	public static void calcCatererProfitReport(
			double amountChargedCustomerForEachPizza, int numberOfPeopleAtParty,
			int numberOfSlicesPerPerson, int numberOfSlicesPerPizza,
			double costOfEachPizza) {
		int pizzasRequired = (numberOfPeopleAtParty * numberOfSlicesPerPerson)
				/ numberOfSlicesPerPizza;
		float customerCostForParty = (float) (pizzasRequired * amountChargedCustomerForEachPizza);
		float catererCost = (float) (pizzasRequired * costOfEachPizza);
		float profit = (float) (customerCostForParty - catererCost);
		System.out.println("\n\nCaterer Profit Report\nCustomer paid $"
				+ customerCostForParty + " for " + pizzasRequired + " pizzas."
				+ "\nCaterer cost for the party is $" + catererCost + " for "
				+ pizzasRequired + " pizzas" + "\nProfit made is $" + profit
				+ ".");
	}

}
