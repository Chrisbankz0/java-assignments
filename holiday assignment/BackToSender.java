import java.util.Scanner;

public class BackToSender {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Back To Sender LLC");
        System.out.print("Enter successful deliveries today: ");
        int successfulDeliveries = input.nextInt();

        int basePay = 5000;
        int amountPerParcel = 0;
        int daysWage;

        if (successfulDeliveries < 1 || successfulDeliveries > 100) {
		System.out.println("Invalid amount! Deliveries must be between 1 and 100.");
		return;
        }
        else if (successfulDeliveries < 50) {
                amountPerParcel = 160;
            } 
	else if (successfulDeliveries <= 59) {
                amountPerParcel = 200;
            } 
	else if (successfulDeliveries <= 69) {
                amountPerParcel = 250;
            } 
	else {
		amountPerParcel = 500;
            }

            daysWage = (successfulDeliveries * amountPerParcel) + basePay;
            System.out.printf("Total wage for today is %,d", daysWage);

    }
}
