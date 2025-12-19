//we collecting user input for 3 times, we are collecting miles and gallon used in the trip 
//to determine the miles per gallon and print the print the total sum of all trips


import java.util.Scanner;

public class Driver{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);
	
	int totalmiles = 0;
	int totalgallons = 0;	

	for( int drive = 1; drive <= 3; drive++){

	System.out.print("Enter miles driven: ");
	int miles = input.nextInt();

	System.out.print("Enter gallon used: ");
	int gallon = input.nextInt();

	float total = miles/gallon;

	totalmiles += miles;
	totalgallons += gallon;

	float totalmpg = totalmiles/totalgallons;

	System.out.printf("The gallon per miles is: %.2f%n", total);
	
	System.out.printf("The total is of both miles and gallon is: %f%n", totalmpg);

	}


}
}
