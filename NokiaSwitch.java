import java.util.Scanner;

public class NokiaSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String levelOne = """
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

        
         String levelTwoOne = """
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


        String levelTwoTwo = """
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


        String levelTwoFour = """
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


                System.out.println(levelOne);
    }

    
}
