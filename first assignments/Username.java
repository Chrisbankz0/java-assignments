import java.util.Scanner;

public class Username{
public static void main(String[]  args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter username: ");
	String nam = input.nextLine();


	System.out.print("Enter password: ");
	String pass = input.nextLine();


	String name = "chrisbankz";
	String password = "chrisbankz";

if (nam.equals(name) && pass.equals(password))
System.out.print("Login Successful");

else
System.out.print("credential invalid");






}
}