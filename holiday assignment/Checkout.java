import java.util.ArrayList;
import java.util.Scanner;

public class Checkout{
public static void main(String[]  args){

	Scanner input = new Scanner(System.in);
	
	ArrayList<String> productNames = new ArrayList<>();
	ArrayList<Integer> quantities = new ArrayList<>();
	ArrayList<Double> prices = new ArrayList<>();
	ArrayList<Double> totals = new ArrayList<>();


	System.out.print("whats's the customer's name: ");
	String CustomerName = input.nextLine();

	while (true){

		System.out.print("whats did the user buy? ");
		String productName = input.nextLine();


		System.out.print("How many pieces? ");
		int quantity = input.nextInt();


		System.out.print("how much per unit? ");
		double price = input.nextDouble();

		input.nextLine();


		productNames.add(productName);
		quantities.add(quantity);
		prices.add(price);
		totals.add(quantity * price);

		System.out.print("Add more items? (yes/no): ");
		String addMore = input.nextLine();

		if (addMore.equalsIgnoreCase("no")){ 
			break;
		}
	}

	input.nextLine();

	System.out.print("what's your name: ");
	String cashierName = input.nextLine();

	System.out.print("What's the discount percentage: ");
	double discountPercentage = input.nextDouble();


	double subTotal = 0;

	for (int num = 0; num < totals.size(); num++) {
		subTotal += totals.get(num);
	}

	double discount = (discountPercentage / 100) * subTotal;
	double vat = 0.075 * subTotal;
	double biilTotal = subTotal - discount + vat;

	input.nextLine();

	System.out.println("SEMICOLON STORES");
	System.out.println("MAIN BRANCH");
	System.out.println("LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
	System.out.println("TEL: 094979028324");
	System.out.println("DATE: 21-06-2030  9:00:31 AM");
	System.out.printf("CASHIER NAME: %s%n",cashierName );
	System.out.printf("CUSTOMER NAME: %s%n",CustomerName);
	System.out.println("-----------------------------------");
	System.out.println("------------------------------------");
	System.out.printf("%-15s %-5s %-8s %-10s%n", "ITEM", "QTY", "PRICE", "TOTAL");

	for (int num = 0; num < productNames.size(); num++){
		System.out.printf("%-15s %-5d %-8.2f %-10.2f%n", productNames.get(num), quantities.get(num), prices.get(num), totals.get(num));

	}

	System.out.println("----------------------------------------");
	System.out.printf("Sub Total is: %.2f%n", subTotal);
	System.out.printf("Discount is: %.2f%n", discount);
	System.out.printf("Vat @7.5 of total is: %.2f%n", vat);
	System.out.println("----------------------------------------");
	System.out.printf("The Total Bill is: %.2f%n", biilTotal);	System.out.println("----------------------------------------");
	System.out.printf("THIS IS NOT A RECEIPT, KINDLY PAY: %.2f%n", biilTotal);

	input.nextLine();

	System.out.print("How much did the Customer give you? ");
	double amountPaid = input.nextDouble();

	input.nextLine();

	double balance = amountPaid - biilTotal;


	System.out.println("------Final Receipt-------------");
	System.out.printf("CASHIER NAME: %s%n",cashierName );
	System.out.printf("CUSTOMER NAME: %s%n",CustomerName);
	System.out.println("--------------------------------");
	System.out.printf("The Total Bill is: %.2f%n", biilTotal);
	System.out.printf("The Amount paid is: %.2f%n", amountPaid);
	System.out.printf("The Total Balance is: %.2f%n", balance);
	System.out.println("--------------------------------");
	System.out.println("THANK YOU FOR SHOPPING WITH US");
	System.out.println("--------------------------------");

}

}