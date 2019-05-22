import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/**
		 * Information Needed: Number of people at the party Number of pizza slices
		 * needed for each person Caterer cost for each pizza Customer cost for each
		 * pizza
		 * 
		 * Example information to your program: numberOfSlicesForEachPerson (assume 4
		 * for your first test) numberOfSlicesPerPizza (assume 8 for your first test)
		 * costOfEachPizza (assume $16 for your first test)
		 * amountChargedCustoerForEachPizzza (assume $20 for your first test)
		 * 
		 * 
		 * Program Outputs invoiceToThePartyCustmer - Indicate number of pizzas, number
		 * of slices and total cost for the Party
		 * totalCostToTheCatererForPizzasPurchased - profitEarned
		 * 
		 * In this assignment you need to create two user defined methods. Suggested
		 * method names customerInvoiceReport catererProfitReport
		 * 
		 * Example Inputs from Main How Many People at Your Party: 30 How Many Slices
		 * for each Person: 4 How many slices will each pizza be cut into: 8 Caterer
		 * cost for each Pizza: $16.50 Customer charge for each Pizza $20.00
		 * 
		 * Example output -Customer Invoice Report The party will require 15 pizzas
		 * yielding 120 slices The customer cost for the party is 15*20.00=$300
		 * 
		 * -Caterer Profit report Customer paid $300 for 15 pizzas Caterer cost for the
		 * party is $247.50 for 15 pizzas Profit made is $52.50
		 * 
		 * Test your program for the following party sizes Party 1 75 people Slices per
		 * person = 3 Slices per pizza = 8 customer cost per pizza $18.00 Cater cost per
		 * pizza $14.50
		 * 
		 * Party 2 200 people Slices per person = 4 Slices per pizza = 8 Customer pays
		 * $12.00 per pizza Caterer pays $7.00 per pizzas
		 */
		Scanner stdin = new Scanner(System.in);
		int numberOfPeopleAtParty;
		int numberOfSlicesPerPerson;
		int numberOfSlicesPerPizza;
		double costOfEachPizza;
		int amountChargedCustomerForEachPizza;

		System.out.println("Enter the number of people at the party");

		numberOfPeopleAtParty = stdin.nextInt();
		System.out.println("Enter the number of slices per person");
		numberOfSlicesPerPerson = stdin.nextInt();
		System.out.println("Enter the number of slices per pizza");
		numberOfSlicesPerPizza = stdin.nextInt();
		System.out.println("Enter the cost of each pizza");
		costOfEachPizza = stdin.nextDouble();
		System.out.println("Enter the ammount charged to the customer");
		amountChargedCustomerForEachPizza = stdin.nextInt();
	
	int pizzasRequired = (numberOfPeopleAtParty * numberOfSlicesPerPerson) / numberOfSlicesPerPizza;
	int sliceYield = pizzasRequired / numberOfSlicesPerPizza;
	int customerCostForParty = pizzasRequired * amountChargedCustomerForEachPizza;
	double catererCost = pizzasRequired * costOfEachPizza;
	double profit = customerCostForParty - catererCost;

	String customerInvoiceReport = "\nCustomer Invoice Report\nThe party will require "+pizzasRequired+" pizzas yielding "+sliceYield+" slices."+"\nThe customer cost for the party is "+customerCostForParty+".";

	String catererProfitReport = "\n\nCaterer Profit Report\nCustomer paid "+customerCostForParty+" for "+pizzasRequired+" pizzas."+"\nCaterer cost for the party is "+catererCost+" for "+pizzasRequired+" pizzas"+"\nProfit made is "+profit+".";
	
	System.out.print(customerInvoiceReport);
	System.out.print(catererProfitReport);

	
	
}

}
