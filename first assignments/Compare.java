import java.util.Scanner;

public class Compare{
public static void main(String[]  args){

Scanner input = new Scanner(System.in);

	System.out.print("enter number: ");
	int num = input.nextInt();

	int square = (num * num);

	if (square > 100)
	System.out.printf(" %d is greater than 100", square);

	else if (square < 100)
	System.out.printf(" %d is lesser than 100", square);

	else if (square == 100)
	System.out.printf(" %d is equal than 100", square);

	else if (square != 100)
	System.out.printf(" %d is not equal than 100", square);


}
}