import java.util.Scanner;
public class MortgageCalculator{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);



	System.out.print("Enter the principal amount: ");
	double amount = input.nextDouble();

	System.out.print("Enter the Duration in years: ");
	int duration = input.nextInt();

	int numberOfPayments = duration * 12;

	System.out.println("\nInterest Rate    Monthly Payment    Total Payment");

	for(double rate = 5.0; rate <= 10.00; rate +=0.25){


		double monthlyRate = rate / 100.0 / 12;

		double monthlyPayment = amount * (monthlyRate * Math.pow(1 + monthlyRate, numberOfPayments)) / (Math.pow(1 + monthlyRate, numberOfPayments) - 1);

		double totalPayment = monthlyPayment * numberOfPayments;
		
		System.out.printf("%6.3f%%          %10.2f        %10.2f\n",rate, monthlyPayment, totalPayment);
	}


 }
}




