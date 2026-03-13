import java.util.Scanner;

public class FunctionPizza{


public static void menu(){
	System.out.print("""
	Welcome to COHORT 29 pizza joint LEKKI BRANCH
	_______________________________________________
	Pizza type        number of Slices         Price per box
	----------------------------------------------------------
	1. SAPA SIZE              4                        2,000
	2. SMALL MONEY            6                        2,400
	3. BIG BOYS               8                        3,000
	4. ODOGWU                 12                       4,200
	""");

}


public static int[] getInput() {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number of guests: ");
	int guests = input.nextInt();

	System.out.print("Enter pizza choice: ");
	int pizzaType = input.nextInt();

	return new int[]{guests, pizzaType};
}

public static int[] pizzaDetails(int pizzaType) {

	int slicePerBox = 0;
	int pricePerBox = 0;

	switch (pizzaType) {

		case 1:
			slicePerBox = 4;
			pricePerBox = 2000;
			break;

		case 2:
			slicePerBox = 6;
			pricePerBox = 2400;
			break;

		case 3:
			slicePerBox = 8;
			pricePerBox = 3000;
			break;

		case 4:
			slicePerBox = 12;
			pricePerBox = 4200;
			break;

		default:
			System.out.println("Invalid pizza type");
			System.exit(0);
	}

	return new int[]{slicePerBox, pricePerBox};
	}


public static void main(String[] args){
	menu();
	int[] inputData = getInput();


	}

}