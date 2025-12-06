import java.util.Scanner;

public class Number{
	public static void main(String[]  args){

	Scanner input = new Scanner (System.in);

	System.out.print("Enter first Number: ");
	int first_Number = input.nextInt();

	
	System.out.print("Enter second Number: ");
	int second_Number = input.nextInt();


	if (first_Number > second_Number){
		System.out.println(first_Number + " is greater than " + second_Number);
}

	else {
		System.out.println(second_Number + " is greater than " + first_Number);

}



}
}