 import java.util.Scanner; 
 public class TaskFour {
 public static void main(String[] args) {



 Scanner input = new Scanner(System.in);

int scoreEven = 0;
double scoreAverage = 0.0;
int evenCounter = 0


for(int number = 1; number <= 10; number++){
	System.out.print("enter number: ");
	int scores = input.nextInt();

	if(scores % 2 == 0){
		scoreEven += scores;
		evenCounter ++
	}

}
	scoreAverage = scoreEven / 10.0;

	System.out.printf("the sum of the even indexed scores is %d%n", scoreAverage);
	
 }
 }