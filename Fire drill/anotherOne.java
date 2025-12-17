 import java.util.Scanner; 
 public class anotherOne {
 public static void main(String[] args) {


 Scanner input = new Scanner(System.in);

int scoreEven = 0;

for(int number = 1; number <= 10; number++){
	System.out.print("enter number: ");
	int scores = input.nextInt();

	if(scores % 2 == 0){
			System.out.printf("the number is even is %d%n", scoreEven);
	}

}

	
 }
 }