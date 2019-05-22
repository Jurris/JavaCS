import java.util.Scanner;

public class main {

	public static void main(String[] args) {

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
