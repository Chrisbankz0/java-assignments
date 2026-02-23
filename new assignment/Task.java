public class Task {


	public static void TaskOne(){
		String textValue = "PythonProgramming";
		String reversedText = "";

		System.out.println("Reverse of string:");

        	for(int index = textValue.length() - 1; index >= 0; index--){
			reversedText += textValue.charAt(index);
		}

		System.out.println(reversedText);
	}


	public static void TaskTwo(){
		int numberValue = 12345;
        	String reversedNumber = "";
        	String numberAsText = String.valueOf(numberValue);

        	System.out.println("Reverse of integer:");

        	for(int index = 0; index < numberAsText.length(); index++){
			reversedNumber = numberAsText.charAt(index) + reversedNumber;
		}

		System.out.println(reversedNumber);
	}


	public static void TaskThree(){
        	String textValue = "PyTHonProGRAM";
        	int uppercaseCount = 0;

		System.out.println("Count of uppercase letters:");

		for(int index = 0; index < textValue.length(); index++){
			char currentCharacter = textValue.charAt(index);

			if(currentCharacter >= 'A' && currentCharacter <= 'Z'){
				uppercaseCount++;
			}
		}

		System.out.println(uppercaseCount);
	}


	public static void TaskFour(){
		String textValue = "PyTHonProGRAM";
		int lowercaseCount = 0;

		System.out.println("Count of lowercase letters:");

		for(int index = 0; index < textValue.length(); index++){
			char currentCharacter = textValue.charAt(index);

			if(currentCharacter >= 'a' && currentCharacter <= 'z'){
				lowercaseCount++;
			}
		}

		System.out.println(lowercaseCount);
	}


	public static void TaskFive(){
		String textValue = "House";
		int position = -1;

		System.out.println("Position of first vowel:");

		for(int index = 0; index < textValue.length(); index++){
			char currentCharacter = 
			Character.toLowerCase(textValue.charAt(index));

			if(currentCharacter == 'a' ||
			currentCharacter == 'e' ||
			currentCharacter == 'i' ||
			currentCharacter == 'o' ||
			currentCharacter == 'u'){
			position = index;
			break;
		}
	}

		System.out.println(position);
	}


	public static void TaskSix(){
		String textValue = "Python";

		System.out.println("Characters with ASCII values:");

		for(int index = 0; index < textValue.length(); index++){
		char currentCharacter = textValue.charAt(index);
		int asciiValue = (int) currentCharacter;

		System.out.println(currentCharacter + " = " + asciiValue);
		}
	}


	public static void TaskSeven(){
		int totalSum = 0;
		int numberCount = 0;

		System.out.println("Average of numbers from 1 to 100:");

		for(int numberValue = 1; numberValue <= 100; numberValue++){
			totalSum += numberValue;
			numberCount++;
		}

		double averageValue = (double) totalSum / numberCount;

		System.out.println(averageValue);
	}


	public static void TaskEight(){
		int numberValue = 12;

		System.out.println("Divisors of " + numberValue);

		for(int possibleDivisor = 1; possibleDivisor <= numberValue; possibleDivisor++){
		if(numberValue % possibleDivisor == 0){
			System.out.println(possibleDivisor);
			}
		}
	}


	public static void TaskNine(){
		int numberValue = 12;
		int divisorCount = 0;

		System.out.println("Count of divisors of " + numberValue);

		for(int possibleDivisor = 1; possibleDivisor <= numberValue; possibleDivisor++){
			if(numberValue % possibleDivisor == 0){
				divisorCount++;
			}
		}

		System.out.println(divisorCount);
	}


	public static void main(String[] args){

		TaskOne();   
		System.out.println();
		TaskTwo();   
		System.out.println();
		TaskThree();
		System.out.println();
		TaskFour();  
		System.out.println();
		TaskFive();  
		System.out.println();
		TaskSix();
		System.out.println();
		TaskSeven();
		System.out.println();
		TaskEight();
		System.out.println();
		TaskNine();
    }
}