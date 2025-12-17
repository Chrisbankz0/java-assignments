import java.util.Scanner;

public class TaxCalculator{
public static void main(String[]  args){

	Scanner input = new Scanner(System.in);


	for(int day = 1; day <= 3; day ++) {
	
	System.out.print("enter name: ");
	String name = input.next();

	System.out.print("enter earning: ");
	int earnings = input.nextInt();

	double tax;

	if(earnings <= 30000){
		tax = 0.15*earnings;
	}
	else{
		tax = (0.20*earnings);
		}

	System.out.printf("citizen: %s, Total tax is: $%.2f%n", name, tax);
	}


}
} 