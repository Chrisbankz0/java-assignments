//collect items sold by sales and calculate the percentage of the good sold and add base pay which is 200$
import java.util.Scanner;

public class SalaryRate{

    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

int salary = 200;
double commissionRate = 0.09;
double totalSales = 0.0;
double itemValue = 0.0;
int item;



System.out.println("Enter item sold (1-4)");
item = input.nextInt();


while (item != 0){

	if (item == 1){
        itemValue = 238.99;
	}

	else if(item == 2){
        itemValue = 129.75;
	}

	else if(item == 3){
        itemValue = 99.95;
	}

	else if(item == 4){
        itemValue = 350.89;
	}

	else{
    	System.out.println("Invalid Item Number");
	}

    totalSales += itemValue;


    System.out.println("Enter item sold (1-4) or 0 to see results");
    item = input.nextInt();


}


	double commission = totalSales * commissionRate;
	double total = salary + commission;


	System.out.printf("Total Sales made: $%.2f%n", totalSales);
	System.out.printf("Salary plus commission of sales: $%.2f%n", total);


}

}