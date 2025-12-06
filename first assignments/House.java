import java.util.Scanner;

public class House{
	public static void main(String[] args){
	
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first name : ");
	String firstName = input.nextLine() ;

	System.out.print("Enter last name : ");
	String lastName = input.nextLine() ;

	System.out.println("Hello " + firstName + " " +lastName);

}

}