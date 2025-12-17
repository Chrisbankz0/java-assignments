 import java.util.Scanner; 
 public class TaskOne {
 public static void main(String[] args) {



 Scanner input = new Scanner(System.in);

int scoreSum = 0;

for(int number = 1; number <= 10; number++){
	System.out.print("enter number: ");
	int scores = input.nextInt();


	scoreSum += scores;

}

 System.out.printf("Score sum is: %d%n", scoreSum);
 }
 }