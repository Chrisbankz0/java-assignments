 import java.util.Scanner; 
 public class TaskTwo{
 public static void main(String[] args) {



 Scanner input = new Scanner(System.in);

int scoreSum = 0;
double scoreAverage = 0.0; 

for(int number = 1; number <= 10; number++){
	System.out.print("enter number: ");
	int scores = input.nextInt();


	scoreSum += scores;
	scoreAverage = scoreSum / 10.0;

}

 System.out.printf("Class average is %.2f%n", scoreAverage);


 }
 }