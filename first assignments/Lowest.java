import java.util.Scanner;

public class Lowest{
public static void main(String[]  args){

Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int num1 = input.nextInt();

	System.out.print("Enter second number: ");
	int num2 = input.nextInt();

	System.out.print("Enter third number: ");
	int num3 = input.nextInt();

if (num1 < num2 && num1 < num3)
	System.out.printf("%d is less", num1);
else if (num2 < num3 && num2 < num1)
	System.out.printf("num2 is less");

else if (num3 < num1 && num3 < num2)
	System.out.print("num3 is less");

}
}