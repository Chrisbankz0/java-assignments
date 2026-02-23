public class LoopTask{

	public static void TaskOne(){
		System.out.println("Even numbers between 1-100: ");
		for(int num = 1; num <= 100; num++){
			if(num % 2 == 0){
				System.out.println(num);
			}
		}
	}



	public static void TaskTwo(){
		System.out.println("Odds numbers between 50-100: ");
		for(int num = 50; num <= 100; num++){
			if(num % 2 != 0){
				System.out.println(num);
			}
		}
	}

	public static void TaskThree(){
		System.out.println("Number from 100 - 1 ");
		for(int num = 100; num >= 1; num--){
			System.out.println(num);
		}
	}

	public static void TaskFour(){
		System.out.println("Number from 100 - 1 ");
		for(int num = 1; num <= 20; num++){
			System.out.println(num * num);
		}
	}

	public static void TaskFive(){
		System.out.println("Multiples of 3 between 1-50 ");
		for(int num = 1; num <= 50; num++){
			if(num % 3 == 0){
				System.out.println(num);
			}
		}
	}

	public static void TaskSix(){
		System.out.println("Numbers between 1 and 100 divisible by both 3 and 5:");
		for(int num = 1; num <= 100; num++){
			if(num % 3 == 0 && num % 5 == 0){
				System.out.println(num);
			}
		}
	}

	public static void TaskSeven(){
		int count = 0;
		System.out.println("Count of numbers divisible by 7 between 1 and 100:");
		for(int num = 1; num <= 100; num++){
			if(num % 7 == 0){
				count +=1;
			}
		}
		System.out.println(count);
	}

	public static void TaskEight(){
		int count = 0;
		System.out.println("Sum of first 50 natural numbers:");
		for(int num = 1; num <= 50; num++){
				count += num;
		}
		System.out.println(count);
	}

	public static void TaskNine(){
		int count = 1;
		System.out.println("Product of first 10 natural numbers:");
		for(int num = 1; num <= 10; num++){
				count *=num;
		}
		System.out.println(count);
	}

	public static void TaskTen(){
		System.out.println("Letters from A to Z:");
		for(char ch = 'A'; ch <= 'Z'; ch++){
			System.out.println(ch);
		}
	}

	public static void TaskEleven(){
		int number = 5;
		System.out.println("Multiplication table of " + number + ":");
		for(int num = 1; num <= 12; num++){
			System.out.println(number + " x " + num + " = " + (number * num));
		}
	}

	public static void TaskTwelve(){
		String text = "Queen";
		System.out.println("Characters in the string:");
		for(int num = 0; num < text.length(); num++){
			System.out.println(text.charAt(num));
		}
	}

	public static void TaskThirteen(){
		String sentence = "Elephant never forgets";
		int letterCount = 0;

		System.out.println("Count of letter 'e':");

		for(int index = 0; index < sentence.length(); index++){
			char currentCharacter = sentence.charAt(index);

			if(currentCharacter == 'e' || currentCharacter == 'E'){
				letterCount++;
			}
		}

		System.out.println(letterCount);
	}

	public static void TaskFourteen(){
		String lowercaseText = "hello world";
		String convertedText = "";
	
		System.out.println("Lowercase to Uppercase:");

		for(int index = 0; index < lowercaseText.length(); index++){
			char currentCharacter = lowercaseText.charAt(index);

			if(currentCharacter >= 'a' && currentCharacter <= 'z'){
				currentCharacter = (char)(currentCharacter - 32);
				}

			convertedText += currentCharacter;
			}

		System.out.println(convertedText);
		}

	public static void TaskFifteen(){
		String uppercaseText = "HELLO WORLD";
		String convertedText = "";

		System.out.println("Uppercase to Lowercase:");

		for(int index = 0; index < uppercaseText.length(); index++){
			char currentCharacter = uppercaseText.charAt(index);

			if(currentCharacter >= 'A' && currentCharacter <= 'Z'){
			currentCharacter = (char)(currentCharacter + 32);
			}

		convertedText += currentCharacter;
		}

		System.out.println(convertedText);
	}

	public static void TaskSixteen(){
		String sentence = "Beautiful day";
		int vowelCount = 0;

		System.out.println("Number of vowels:");

		for(int index = 0; index < sentence.length(); index++){
			char currentCharacter = Character.toLowerCase(sentence.charAt(index));

		if(currentCharacter == 'a' || currentCharacter == 'e' || currentCharacter == 'i' || currentCharacter == 'o' || currentCharacter == 'u'){
			vowelCount++;
		}
        }

		System.out.println(vowelCount);
	}


	public static void TaskSeventeen(){
		int numberValue = 123456;
		String numberAsText = String.valueOf(numberValue);
		int digitCount = 0;

		System.out.println("Count of digits:");

		for(int index = 0; index < numberAsText.length(); index++){
			digitCount++;
		}

		System.out.println(digitCount);
	}


	public static void TaskEighteen(){
		int numberValue = 12345;
		String numberAsText = String.valueOf(numberValue);
		int digitSum = 0;

		System.out.println("Sum of digits:");

		for(int index = 0; index < numberAsText.length(); index++){
			int currentDigit = numberAsText.charAt(index) - '0';
			digitSum += currentDigit;
		}

		System.out.println(digitSum);
	}


	public static void TaskNineteen(){
		int numberValue = 38527;
		String numberAsText = String.valueOf(numberValue);
		int largestDigit = 0;

		System.out.println("Largest digit:");

		for(int index = 0; index < numberAsText.length(); index++){
			int currentDigit = numberAsText.charAt(index) - '0';

			if(currentDigit > largestDigit){
			largestDigit = currentDigit;
			}
		}

		System.out.println(largestDigit);
	}


	public static void TaskTwenty(){
		int numberValue = 38527;
		String numberAsText = String.valueOf(numberValue);
		int smallestDigit = 9;

		System.out.println("Smallest digit:");

		for(int index = 0; index < numberAsText.length(); index++){
			int currentDigit = numberAsText.charAt(index) - '0';

		if(currentDigit < smallestDigit){
			smallestDigit = currentDigit;
			}
		}

		System.out.println(smallestDigit);
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
        System.out.println();
        TaskTen();
        System.out.println();
        TaskEleven();
        System.out.println();
        TaskTwelve();
        System.out.println();
	TaskThirteen();
	System.out.println();
        TaskFourteen();
	System.out.println();
        TaskFifteen();
	System.out.println();
        TaskSixteen();
	System.out.println();
        TaskSeventeen();
	System.out.println();
        TaskEighteen();
	System.out.println();
        TaskNineteen();
	System.out.println();
        TaskTwenty();

	}






}