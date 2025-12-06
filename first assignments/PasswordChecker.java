import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter password: ");
        String pass = input.nextLine();

        int length = pass.length();

        if (length < 1)
            System.out.println("Invalid");
        else if (length < 6)
            System.out.println("Weak");
        else if (length <= 10)
            System.out.println("Medium");
        else
            System.out.println("Strong");
    }
}