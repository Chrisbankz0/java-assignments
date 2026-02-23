import java.util.Scanner;
import java.util.Arrays;
public class TaskTwo{
public static void main(String[] args) {

Scanner input = new Scanner(System.in);
 [] int scores = new Arrays [10];



for(int number = 1; number <= 10; number++){
	System.out.print("enter number: ");
	int score = input.nextInt();

	scores.add(score);

}

 System.out.printf("Class average is %.2f%n", scores);


 }
 }