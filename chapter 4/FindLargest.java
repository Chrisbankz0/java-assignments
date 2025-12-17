import java.util.Scanner;

public class FindLargest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;
        int largest = Integer.MIN_VALUE;

        for (int counter = 1; counter <= 10; counter++) {

            System.out.print("Enter score " + counter + ": ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }
        }

        System.out.printf("The largest number is %d\n", largest);
    }
}
