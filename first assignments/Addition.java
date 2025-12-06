import java.util.Scanner;

public class Addition {
	public static void main(String[] arg){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();

		if(firstNumber < 0 || firstNumber > 100 || firstNumber == -0){
			System.out.println("Why nah have sense!!");
		}

		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();
	
		if(secondNumber < 0 || secondNumber > 100 || secondNumber == -0){
			System.out.println("Why nah have sense!!");
		}


		int sum = firstNumber - secondNumber;

		System.out.println("The sum is " sum);
	}
}