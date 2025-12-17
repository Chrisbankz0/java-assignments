import java.util.Scanner;

class CustomerCare{

	static void main(String[] args){

		Scanner input = new Scanner(System.in);





		String englishMenu = """

		WELCOME TO CHRIS NOKIA

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

//Also the user enters 1 here

	switch(englishMenuChoice) {

    case 1 -> {
        System.out.println("Phonebook Menu");



        String phoneBookMenu = """
        Press 1 - Search
        Press 2 - Service Nos
        Press 3 - Add name
        Press 4 - Erase
        Press 5 - Edit
        Press 6 - Assign tone
        Press 7 - Send b'card
        Press 8 - Options
        Press 9 - Speed dials
        Press 10 - Voice tags
        Press 11 - Exit
        """;

        System.out.println(phoneBookMenu);
        int phonebookMenuChoice = input.nextInt();


switch(phonebookMenuChoice){

	case 1 -> {
     System.out.println("Search");
	System.exit(0);

		}

	case 2 -> {
     System.out.println("Service Nos");
	System.exit(0);

		}

	case 3 -> {
     System.out.println("Add name");
	System.exit(0);

		}

	case 4 -> {
     System.out.println("erase");
	System.exit(0);

		}

	case 5 -> {
     System.out.println("Edit");
	System.exit(0);

		}

	case 6 -> {
     System.out.println("Assign Tone");
	System.exit(0);

		}

	case 7 -> {
     System.out.println("send b'board");
	System.exit(0);

		}

	case 8 -> {
     System.out.println("Option Menu");
 System.out.println("1. type of view");
 System.out.println("2. Memory status");

		}

	case 9 -> {
     System.out.println("Speed dials");
	System.exit(0);

		}

	case 10 -> {
     System.out.println("Voice tags");
	System.exit(0);

		}

	case 11 -> {
     System.exit(0);

		}

	

	}
    }

    case 2 -> {
        System.out.println("Messages Menu");

        String messagesMenu = """
        Press 1 - Write message
        Press 2 - Inbox
        Press 3 - Outbox
        Press 4 - Pictures messages
        Press 5 - Templates
        Press 6 - Smiley
        Press 7 - Message settings
        Press 8 - info service
        Press 9 - Voice mainbox number
        Press 10 - service command editor
      
        """;

        System.out.println(messagesMenu);
        int messagesMenuChoice = input.nextInt();


switch(messagesMenuChoice){

	case 1 -> {
     System.out.println("Write messages");
	System.exit(0);

		}

	case 2 -> {
     System.out.println("inbox");
	System.exit(0);

		}

	case 3 -> {
     System.out.println("Outbox");
	System.exit(0);

		}

	case 4 -> {
     System.out.println("Picture messages");
	System.exit(0);

		}

	case 5 -> {
     System.out.println("Templates");
	System.exit(0);

		}

	case 6 -> {
     System.out.println("Smileys");
	System.exit(0);

		}

	case 7 -> {
     System.out.println("Message settings Menu");
        String Menu = """
        Press 1 - set
        Press 2 - common
      
        """;

        System.out.println(Menu);
        int messagessettinsChoice = input.nextInt();

switch(messagessettinsChoice){
	case 1 -> {
     System.out.println("Set Menu");
 System.out.println("1. message center number");
 System.out.println("2. Message sent as");
 System.out.println("3. Message validity");


		}
	case 2 -> {
     System.out.println("common Menu");
 System.out.println("1. Delivery reports");
 System.out.println("2. Reply Via same center");
 System.out.println("3. Message validity");

	}
}

		}
	}
//case 2 close is below
    }


    case 3 -> {
        System.out.println("Chat");
	System.exit(0);

    }



    case 4 -> {
        System.out.println("Call Register Menu");

        String callRegisterMenu = """
        Press 1 - Missed calls
        Press 2 - Received calls
        Press 3 - Dialled numbers
        Press 4 - Erase recent call list
        Press 5 - Show call duration
        Press 6 - Show call costs
        Press 7 - call cost settings
        Press 8 - Prepaid credit

        """;

        System.out.println(callRegisterMenu);
        int callRegisterMenuChoice = input.nextInt();

switch(callRegisterMenuChoice){

	case 1 -> {
     System.out.println("Missed calls");
	System.exit(0);

		}

	case 2 -> {
     System.out.println("Recieved calls");
	System.exit(0);

		}

	case 3 -> {
     System.out.println("Dialled numbers");
	System.exit(0);

		}

	case 4 -> {
     System.out.println("Erase recent call list");
	System.exit(0);

		}


	case 5 -> {
     System.out.println("Show call duration Menu");
        String showCallDurationMenu = """
        press 1 - last call duration
	press 2 - All call duration
        press 3 - Recieved calls duration
        press 4 - Dialled calls duration
        press 5 - Clear timers
        """;

        System.out.println(showCallDurationMenu);
		}


	case 6 -> {
     System.out.println("Show call costs Menu");
        String showCallCostsMenu = """
        1 - last call cost
        2 - All call cost
        3 - Clear counters
        """;

        System.out.println(showCallCostsMenu);
	System.exit(0);

		}


	case 7 -> {
     System.out.println("call cost settings Menu");
        String callCostSettingsnMenu = """
        1 - Call cost limit
        2 - Show costs in
        """;

        System.out.println(callCostSettingsnMenu);
		}
//the switch close is below
	}


//case 4 close is below
    }

    case 5 -> {
        System.out.println("Tones Menu");

        String TonesMenu = """
        1 - Ringing tone
        2 - Ringing volume
        3 - Incoming call alert
        4 - Composer
        5 - Message alert tone
        6 - Keypad tones
        7 - Warning and game tones
        8 - Vibrating alert
        9 - Screen saver
        """;

        System.out.println(TonesMenu);
    }

    case 6 -> {
        System.out.println("Settings Menu");

        String settingsMenu = """
        Press 1 - Call settings
        Press 2 - Phone setting
        Press 3 - Security settings
        Press 4 - Restore factory settings
        """;

        System.out.println(settingsMenu);
        int settingsMenuChoice = input.nextInt();

switch(settingsMenuChoice){
	case 1 -> {
     System.out.println("Call settings Menu");
        String callSettingsMenu = """
        1 - Automatic redial
        2 - Speed dialling
        3 - Call waiting options
        4 - Own number sending
        5 - Phone line in use
        6 - Automaic answer
        """;

        System.out.println(callSettingsMenu);
		}
	case 2 -> {
     System.out.println("Phone settings Menu");
        String phoneSettingsMenu = """
        1 - Language
        2 - Cell info display
        3 - Welcome note 
        4 - Network selection
        5 - Lights
        6 - Confirm SIM service actions
        """;

        System.out.println(phoneSettingsMenu);

		}
	case 3 -> {
     System.out.println("Security Menu");
        String securityMenu = """
        1 - PIN code request
        2 - Call info display
        3 - Fixed dialling
        4 - Closed user group
        5 - phone security
        6 - Change access codes
        """;

        System.out.println(securityMenu);
		}
//the switch close is below
	}
//the close of 6 is below
    }

    case 7 -> {
        System.out.println("call Divert");

    }

    case 8 -> {
        System.out.println("games");

    }

    case 9 -> {
        System.out.println("calculator ");

    }

    case 10 -> {
        System.out.println("Reminders");

    }

    case 11 -> {
        System.out.println("Clock Menu");

        String clockMenu = """
        1 - Alarm clock
        2 - Clock settings
        3 - Date settings
        4 - Stopwatch
        5 - Countdown timer
        6 - Auto update of date and time
        """;

        System.out.println(clockMenu);
    }

    case 12 -> {
        System.out.println("Profile Menu");

    }

    case 13 -> {
        System.out.println("Sim services Menu");

    }
    // add more cases here...
}




		}


	}