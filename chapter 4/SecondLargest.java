import java.util.Scanner;

public class SecondLargest{
public static void main(String[]  args){

	Scanner input = new Scanner(System.in);

	int largest = 0;
	int secondLargest = 0;
	int number;

	for(int num = 1; num <= 10; num++){

	System.out.print("Enter your number " +num+ ":" );
	number = input.nextInt();

	if(number > largest) {
                secondLargest = largest;
                largest = number;
		} 

	else if (number > secondLargest) {
                secondLargest = number;
            	}
	}

	System.out.printf("Largest number is: %d%n", largest);
	System.out.printf("Largest number is: %d%n", secondLargest);

}
}
