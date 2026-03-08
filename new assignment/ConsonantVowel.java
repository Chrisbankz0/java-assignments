import java.util.Scanner;

public class ConsonantVowel{
public static void main(String[] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter a word: ");
	String word = input.nextLine();

	int VowelCount = 0;
	int ConsonantCount = 0;
	
	for(int count = 0; count < word.length(); count++){
		char character = Character.toLowerCase(word.charAt(count));

		if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
			VowelCount += 1;
		}

		else{
			ConsonantCount += 1;
		}
	}

	System.out.printf("The number of Vowel is %d%n",VowelCount);
	System.out.printf("The number of consonant is %d",ConsonantCount);


}
}