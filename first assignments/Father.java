import java.util.Scanner;

public class FatherSon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter father's age: ");
        int father = input.nextInt();

        System.out.print("Enter son's age: ");
        int son = input.nextInt();

        int years = Math.abs(father - 2 * son);

        System.out.println("Number of years difference: " + years);
    }
}