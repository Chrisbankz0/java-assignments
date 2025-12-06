import java.util.Scanner;
public class CustomerNokia{
public static void main(String[] args){
  
  Scanner input = new Scanner(System.in);

		String menu = """	
	WELCOME TO Nokia - CHRIS EDITION

	For English - Press 1

	""";

	System.out.print(menu);
	int generalMenuChoice =  input.nextInt();

	switch(generalMenuChoice){

		case  1 -> {System.out.println("English Menu"); 

		String englishMenu = """

	Press 1 -  Phonebok
	Press 2 -  Messages
	Press 3 -  Chat
	Press 4 -  Call register
	Press 5 -  Tones
	Press 6 -  Settings
	Press 7 -  Call divert
	Press 8 -  Games
	Press 9 -  Calculator
	Press 10 - Reminder
	Press 11 - Clock
	Press 12 - Profiles
	Press 13 - Sim services
	""";

	System.out.println(englishMenu); 
	int englishMenuChoice =  input.nextInt();

		switch(englishMenuChoice){
			case 1 -> {System.out.print("Phone book");
		
		String englishSemicolonMenu = """

	Press 1 - Search
	press 2 - Service Nos
	press 3 - Add name
	press 4 - Erase
	press 5 - Edit
	press 6 - Assign tone
	press 7 - Send b'card
	press 8 - Options
	press 9 - Speed dials
	press 10 - Voice tags


	""";
		System.out.println(englishSemicolonMenu); 
		int englishSemicolonMenuChoice =  input.nextInt();



}

}

}

















//the closing case
}
}