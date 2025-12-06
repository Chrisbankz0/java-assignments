import java.util.Scanner;

	public class Calculator{

	public static void main(String[]  args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter number: ");
	double num1 = input.nextDouble();


	System.out.print("enter operator (+, -, *, /): ");
	char op = input.next().charAt(0);


	System.out.print("Enter number: ");
	double num2 = input.nextDouble();

	double result;

	switch(op){
		case '+': result = num1 + num2;
		case '-': result = num1 - num2;
		case '*': result = num1 * num2;
		case '/': result = num1 / num2;
}
	System.out.print("Result: " + result);	

}

}