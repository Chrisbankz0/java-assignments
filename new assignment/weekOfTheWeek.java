import java.util.Scanner;
public class weekOfTheWeek{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

System.out.print("enter day of the week: ");
int num = input.nextInt();

if (num % 7 == 1)
	System.out.printf("it will be Saturday in %d days time%n",num);
if (num % 7 == 2)
	System.out.printf("it will be Sunday in %d days time%n",num);
if (num % 7 == 3)
	System.out.printf("it will be Monday in %d days time%n",num);
if (num % 7 == 4)
	System.out.printf("it will be Tuesday in %d days time%n",num);
if (num % 7 == 5)
	System.out.printf("it will be wednesday in %d days time%n",num);
if (num % 7 == 6)
	System.out.printf("it will be Thursday in %d days time%n",num);
if (num % 7 == 0)
	System.out.printf("it will be friday in %d days time%n",num);





}

}