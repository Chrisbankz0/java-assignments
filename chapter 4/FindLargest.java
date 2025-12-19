import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int largest = 0;

        for (int num = 1; num <= 10; num++) {

            System.out.print("Enter number " + num + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.printf("The largest number is %d%n", largest);
    }
}
