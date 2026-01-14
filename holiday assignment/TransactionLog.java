import java.util.ArrayList;
import java.util.Scanner;

public class TransactionLog {

        static int accountBalance = 0;
        static ArrayList<String> transactions = new ArrayList<>();

    public static void deposit(Scanner input) {
	System.out.print("Enter amount to deposit: ");
	int amount = input.nextInt();

	if(amount > 0){
		accountBalance += amount;
		String record = "Deposited: $" + amount + " | New Balance: $" + accountBalance;
		transactions.add(record);
		System.out.println("Deposit Successful");
		System.out.println(record);
		}
	else{
		System.out.println("Invalid deposit amount");
	}
    }


    public static void withdraw(Scanner input) {
	System.out.print("Enter amount to withdraw: ");
	int amount = input.nextInt();

	if (amount > 0 && amount <= accountBalance) {
		accountBalance -= amount;
		String record = "Withdrawn: $" + amount + " | New Balance: $" + accountBalance;
		transactions.add(record);
		System.out.println("withdrawal Successful");
		System.out.println(record);
        } 
	else {
            System.out.print("Withdrawal failed: insufficient funds");
        }
    }

    public static void showTransactions() {
        if (transactions.size() == 0) {
            System.out.println("No transactions yet");
        } 
	else {
            System.out.println("Transactions so far:");
            for (int num = 0; num < transactions.size(); num++) {
                System.out.println((num + 1) + ". " + transactions.get(num));
            }
        }
    }

public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

        while (true) {
		System.out.println("\nWelcome to Transactions Log App");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Show Transactions");
		System.out.println("4. Exit");

		System.out.print("Enter your choice (1-4): ");
		int choice = input.nextInt();

		switch (choice) {
			case 1:
				deposit(input);
				break;

			case 2:
				withdraw(input);
				break;

			case 3:
				showTransactions();
				break;

			case 4:
				System.out.println("Final Balance: $" + accountBalance);
				showTransactions();
				System.out.println("Thank you for using the Transactions Log App");
				return;

			default:
				System.out.println("Invalid choice! Please enter 1-4"); 

             }
        }

    }
}