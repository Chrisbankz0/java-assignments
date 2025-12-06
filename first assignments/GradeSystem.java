import java.util.Scanner;

public class GradeSystem{

	public static void main (String [] args){

		Scanner inputCollector = new Scanner (System.in);

		System.out.println("Enter first number: ");
		int firstNum = inputCollector.nextInt();

		System.out.println("Enter second number: ");
		int secondNum = inputCollector.nextInt();

		System.out.println("Enter third number: ");
		int thirdNum = inputCollector.nextInt();

		int total = firstNum + secondNum + thirdNum;

		int average = total/3;

		int product = firstNum * secondNum * thirdNum;

		
		int largest = total;

		if (average > largest)
			largest = average;
		if (product > largest)
			largest = product;

		System.out.printf("The largest is %d%n", largest);
		

		System.out.printf("The total and average of the three numbers are %d and %d respectively %n", total, average);

		


		if (average >= 70){
			System.out.println("Excellent");
			System.out.println("Excellent!!!");}

		else if (average >= 60){
			System.out.println("Very Good");}

		else if (average >= 45){
			System.out.println("Good");}

		else {
			System.out.println("Needs Improvement");}		

}





}