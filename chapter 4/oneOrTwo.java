import java.util.Scanner;

public class oneOrTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

	int result;

	System.out.print("enter a single digit number: ");
	result = input.nextInt();

            while(result != 1 && result != 2) {
                System.out.print("Invalid input. Enter a single digit again: ");
                result = input.nextInt();
            }

    }
}
