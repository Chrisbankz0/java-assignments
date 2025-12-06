import java.util.Scanner;

public class Work{
public static void main(String[]  args){

	Scanner input = new Scanner(System.in);

System.out.print("Enter principal Amount: ");
double amount = input.nextDouble();

System.out.print("Enter rate Amount: ");
double rate = input.nextDouble();

System.out.print("Enter next year: ");
int year = input.nextInt();

double interest = (amount*rate*year)/100;

System.out.printf("The interest is %d", interest);

}
}