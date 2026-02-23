import java.util.Scanner;

public class Mortgage{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

double principal;
int interest;
int duration;
double monthlyRate;
double monthlyPayment;
int numberOfPayment;


	System.out.print("Enter the principal amount: ");
	principal = input.nextInt();

	System.out.print("Enter the Annual interest rate: ");
	interest = input.nextInt();

	System.out.print("Enter the Duration in years: ");
	duration = input.nextInt();

	monthlyRate = interest / 100.0 / 12;

	numberOfPayment = duration * 12;

	factor = Math.pow(1 + monthlyRate, numberOfPayment);

	monthlyPayment = principal * (monthlyRate * factor) / (factor - 1);

	System.out.printf("Your monthly payment is $%,.2f%n", monthlyPayment);

 }
}