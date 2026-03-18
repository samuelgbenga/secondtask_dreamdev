import java.util.Scanner;

public class NokiaSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String levelZero = """
                1  -> Phone Book
                2  -> Messages
                3  -> Chat
                4  -> Call Register
                5  -> Tones
                6  -> Settings
                7  -> Call Divert
                8  -> Games
                9  -> Calculator
                10 -> Reminders
                11 -> Clock
                12 -> Profiles
                13 -> SIM Services
                0  -> End
                """;

        
         String levelZeroOne = """
                1  -> Search
                2  -> Service Nos
                3  -> Add Name
                4  -> Erase
                5  -> Edit
                6  -> Assign tone
                7  -> Send b'Card
                8  -> Options
                9  -> Speed dials
                10 -> Voice tags
                0  -> Back
                """;


        String levelZeroTwo = """
                1  -> Write Message
                2  -> Inbox
                3  -> Outbox
                4  -> Picture Messages
                5  -> Templates
                6  -> Smileys
                7  -> Message Settings
                8  -> Info Service
                9  -> Voice Mailbox Number
                10 -> Service Command editor
                0  -> Back
                """;


        String levelZeroFour = """
                1  -> Missed Calls
                2  -> Recieved Calls
                3  -> Dailed Number
                4  -> Erase recent call lists
                5  -> Show call duration
                6  -> Show call cost
                7  -> Call cost settings
                8  -> Prepaid Credit
                0  -> Back
                """;

        String levelZeroFive = """
                1  -> Ringing tone
                2  -> Ringing volume
                3  -> Incoming call alert
                4  -> Compose
                5  -> Message alert tone
                6  -> Keypad tone
                7  -> Warning and game tones
                8  -> Vibrating alert
                9  -> Screen Saver
                0  -> Back
                """;

        String levelZeroSix = """
                1  -> Call settings
                2  -> Phone Settings
                3  -> Security Settings
                4  -> Restore factory settings
                0  -> Back
                """;

        String levelZeroEleven = """
                1  -> Alarm clock
                2  -> Clock settings
                3  -> Date settings
                4  -> Stopwatch
                5  -> Countdown timer
                6  -> Auto update of date and time
                0  -> Back
                """;

        String levelZeroOneEigth = """
                1  -> Type of view
                2  -> Memory Status
                0  -> Back
                """;

        String levelZeroTwoSeven = """
                1  -> Set 1
                2  -> Common  
                0  -> Back
                """;

        String levelZeroFourFive = """
                1  -> Last call duration
                2  -> All call duration
                3  -> Recieved calls duration
                4  -> Dialled calls duration
                5  -> Clear timer
                0  -> Back
                """;

        String levelZeroFourSix = """
                1  -> Last call cost
                2  -> All call cost
                3  -> Clear counters 
                0  -> Back
                """;

        String levelZeroFourSeven = """
                1  -> Call cost limit
                2  -> Show costs in
                0  -> Back
                """;

        String levelZeroSixOne = """
                1  -> Automatic redial
                2  -> Speed dialing
                3  -> Call waiting options
                4  -> Own number sending
                5  -> Phone line in use
                6  -> Automatic answer  
                0  -> Back
                """;

        String levelZeroSixTwo = """
                1  -> Language
                2  -> Cell info display
                3  -> Welcome note
                4  -> Network selection
                5  -> Lights
                6  -> Confirm SIM service selections
                0  -> Back
                """;

        String levelZeroSixThree = """
                1  -> PIN code request
                2  -> Call bearing service
                3  -> Fixed dialling
                4  -> Closed user group
                5  -> Phone security
                6  -> Change access codes
                0  -> Back
                """;

        String levelZeroTwoSevenOne = """
                1  -> Message centre number
                2  -> Message sent as
                3  -> Message validity
                0  -> Back
                """;

        String levelZeroTwoSevenTwo = """
                1  -> Delivery reports
                2  -> Reply via Same Center
                3  -> Character support
                0  -> Back
                """;

                System.out.println(levelZeroOne);


        
        System.out.print(levelZero);
        System.out.print("Enter an option: ");
        int numlevelZero = input.nextInt();
        switch (numlevelZero) {
            case 1 -> System.out.println("Phone Book selected");
            case 2 -> System.out.println("Messages selected");
            case 3 -> System.out.println("Chat selected");
            case 4 -> System.out.println("Call Register selected");
            case 5 -> System.out.println("Tones selected");
            case 6 -> System.out.println("Settings selected");
            case 7 -> System.out.println("Call Divert selected");
            case 8 -> System.out.println("Games selected");
            case 9 -> System.out.println("Calculator selected");
            case 10 -> System.out.println("Reminders selected");
            case 11 -> System.out.println("Clock selected");
            case 12 -> System.out.println("Profiles selected");
            case 13 -> System.out.println("SIM Services selected");
            case 0 -> System.out.println("End");
            default -> System.out.println("Invalid option");
        }
    }

    
}
