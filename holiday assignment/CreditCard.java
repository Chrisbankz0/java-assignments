import java.util.Scanner;

public class CreditCard{
public static void main(String[]  args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter credit card number: ");
	String card = input.nextLine();

	int len = card.length();
	String cardType = "";


	if(len <13 || len >16){
		System.out.println("invalid credit card length");
	}
	else{
		System.out.println("valid credit card length");
	}


	if(card.startsWith("4")){
		cardType = "Visa card";
	}

	else if(card.startsWith("5")){
		cardType = "master card";
	}

	else if(card.startsWith("37")){
		cardType = "American Express card";
	}

	else if(card.startsWith("6")){
		cardType = "Discover card";
	}
	
	else{
		System.out.println("invalid card");
	}


	System.out.printf("Credit card Type: %s%n", cardType);
	System.out.printf("Credit card length: %d%n", len);


}
}