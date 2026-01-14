import java.util.Scanner;

public class PalindromeChecker{

    public static void main(String[]args){
    Scanner chideraCollector = new Scanner(System.in);
    int number;

while (true) {

    System.out.print("Enter a five-digit integer: ");
    number = chideraCollector.nextInt();

if (number >= 10000 && number <= 99999){
    break;
}else{
    System.out.println("Error: Number must be five digits: Try Again!!");

}


}

  int num1 = number / 10000;  
 int num2 = (number / 1000) % 10;  
 int num4 = (number / 10) % 10;  
 int num5 = number % 10; 

if (num1 == num5 && num2 == num4){
    System.out.println("This number is a palindrome");
}

else{
    System.out.println("This number is not a palindrome");
	}



}




}