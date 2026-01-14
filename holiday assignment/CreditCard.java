import java.util.Scanner;

public class CreditCard{
public static void main(String[]  args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter credit card number: ");
	String card = input.nextLine();

	int len = card.length();
	String cardType = "";


	if(len <13 || len >16){
		System.out.println("invalid credit card");
	}
	else{
		System.out.println("valid credit card");
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


        int total = 0;
        int count = 0;

        for (int num = card.length() - 1; num >= 0; num--) {
            int digit = card.charAt(num) - '0';

            if (count == 0) {
                digit *= 2;

                if (digit > 9) {
                    digit -= 9;
                }
            }

            total += digit;
            count = (count + 1) % 3;
        }


        if (total % 10 == 0) {
            System.out.println("Credit card is VALID");
        } 
	else {
            System.out.println("Credit card is INVALID");
        }



  }
}