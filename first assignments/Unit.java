import java.util.Scanner;

public class Unit{
	public static void main(String[]  args){

	Scanner input = new Scanner (System.in);

	System.out.println("Input distance in km: ");
	double distance = input.nextDouble();

	double distanceMiles = distance* 0.621371;

	System.out.println("The Miles of " + distance + " is " + distanceMiles);


}

}