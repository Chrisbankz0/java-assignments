import java.util.Scanner;

public class Credit{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	int count = 0;

int number;
	
	System.out.print("Enter account number: ");
	number = input.nextInt();

	while(count != 0){
	
	System.out.print("input Beginning balance: ");
	int beginningBalance = input.nextInt();

	System.out.print("input Total charges: ");
	int totalCharges = input.nextInt();

	System.out.print("input Total credits: ");
	int totalCredits = input.nextInt();

	System.out.print("input Credit limit: ");
	int creditLimit = input.nextInt();
	

 int newBalance = beginningBalance + totalCharges - totalCredits;

	System.out.printf("the new balance is: %d%n",newBalance);

	if(newBalance > creditLimit){
		System.out.println("Credit limit is exceeded");
	}

	System.out.print("Enter account number (or 0 to quit): ");
	number = input.nextInt();

}


}

}