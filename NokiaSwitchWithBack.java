import java.util.Scanner;

public class NokiaSwitchWithBack {

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

        String levelZeroOneEight = """
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


        
        System.out.print(levelZero);
        System.out.print("Enter an option: ");
        int numlevelZero = input.nextInt();
        switch (numlevelZero) {
            case 1 -> {
                boolean islevelZeroOne = true;
                while (islevelZeroOne) {
                System.out.println("Phone Book selected");
                System.out.print(levelZeroOne);
                System.out.print("Enter an option: ");
                int numlevelZeroOne = input.nextInt();
                switch (numlevelZeroOne) {
                    case 1 -> System.out.println("Search selected");
                    case 2 -> System.out.println("Service Nos selected");
                    case 3 -> System.out.println("Add Name selected");
                    case 4 -> System.out.println("Erase selected");
                    case 5 -> System.out.println("Edit selected");
                    case 6 -> System.out.println("Assign tone selected");
                    case 7 -> System.out.println("Send b'Card selected");
                    case 8 -> {
                        boolean islevelZeroOneEight = true;

                        while (islevelZeroOneEight) {
                            System.out.println("Options");
                            System.out.print(levelZeroOneEight);
                            System.out.print("Enter an option: ");
                            int numlevelZeroOneEight = input.nextInt();
                            switch (numlevelZeroOneEight) {
                                case 1 -> System.out.println("Type of view");
                                case 2 -> System.out.println("Memory Status");
                                case 0 -> {
                                    System.out.println("Back");
                                    islevelZeroOneEight = false;
                                }
                                default -> System.out.println("Invalid option");
                            }  
                        }
                    }
                    case 9 -> System.out.println("Speed dials selected");
                    case 10 -> System.out.println("Voice tags selected");
                    case 0 -> {System.out.println("Back");
                        islevelZeroOne = false;
                    }
                    default -> System.out.println("Invalid option");
                }   
                }

            }
            case 2 -> {
                boolean islevelZeroTwo = true;

                while (islevelZeroTwo) {
                                  System.out.println("Messages selected");
                        System.out.print(levelZeroTwo);
        System.out.print("Enter an option: ");
        int numlevelZeroTwo = input.nextInt();
        switch (numlevelZeroTwo) {
            case 1 -> System.out.println("Write Message");
            case 2 -> System.out.println("Inbox");
            case 3 -> System.out.println("Outbox");
            case 4 -> System.out.println("Picture Messages");
            case 5 -> System.out.println("Templates");
            case 6 -> System.out.println("Smileys");
            case 7 -> {
                boolean islevelZeroTwoSeven = true;

                while (islevelZeroTwoSeven) {
                                System.out.println("Message Settings");
                        System.out.print(levelZeroTwoSeven);
        System.out.print("Enter an option: ");
        int numlevelZeroTwoSeven = input.nextInt();
        switch (numlevelZeroTwoSeven) {
            case 1 -> {
                boolean islevelZeroTwoSevenOne = true;
                while (islevelZeroTwoSevenOne) {
                    System.out.println("Set 1");
                    System.out.print(levelZeroTwoSevenOne);
                    System.out.print("Enter an option: ");
                    int numlevelZeroTwoSevenOne = input.nextInt();
                    switch (numlevelZeroTwoSevenOne) {
                        case 1 -> System.out.println("Message centre number");
                        case 2 -> System.out.println("Message sent as");
                        case 3 -> System.out.println("Message validity");
                        case 0 -> {System.out.println("Back");
                            islevelZeroTwoSevenOne = false;
                        }
                        default -> System.out.println("Invalid option");
                    }   
                }
            }
            case 2 -> {
                boolean islevelZeroTwoSevenTwo = true;

                while (islevelZeroTwoSevenTwo) {
                       System.out.println("Common");
                         System.out.print(levelZeroTwoSevenTwo);
                        System.out.print("Enter an option: ");
                        int numlevelZeroTwoSevenTwo = input.nextInt();
                        switch (numlevelZeroTwoSevenTwo) {
                            case 1 -> System.out.println("Delivery reports");
                            case 2 -> System.out.println("Reply via Same Center");
                            case 3 -> System.out.println("Character support");
                            case 0 -> {System.out.println("Back");
                                islevelZeroTwoSevenTwo = false;
                            }
                            default -> System.out.println("Invalid option");
        }   
                }
          
            }
            case 0 -> System.out.println("Back");
            default -> System.out.println("Invalid option");

        }
 
                }
   
            }
            case 8 -> System.out.println("Info Service");
            case 9 -> System.out.println("Voice Mailbox Number");
            case 10 -> System.out.println("Service Command editor");
            case 0 -> {System.out.println("Back");
                islevelZeroTwo = false;
            }
            default -> System.out.println("Invalid option");
        }
                }
  

            }
            case 3 -> System.out.println("Chat selected");
            case 4 -> {System.out.println("Call Register selected");
                         System.out.print(levelZeroFour);
        System.out.print("Enter an option: ");
        int numlevelZeroFour = input.nextInt();
        switch (numlevelZeroFour) {
            case 1 -> System.out.println("Missed Calls");
            case 2 -> System.out.println("Received Calls");
            case 3 -> System.out.println("Dialed Number");
            case 4 -> System.out.println("Erase recent call lists");
            case 5 -> {
                boolean islevelZeroFourFive = true;

                while (islevelZeroFourFive) {
                      System.out.println("Show call duration");
                   System.out.print(levelZeroFourFive);
                System.out.print("Enter an option: ");
                int numlevelZeroFourFive = input.nextInt();
                switch (numlevelZeroFourFive) {
                    case 1 -> System.out.println("Last call duration");
                    case 2 -> System.out.println("All call duration");
                    case 3 -> System.out.println("Received calls duration");
                    case 4 -> System.out.println("Dialled calls duration");
                    case 5 -> System.out.println("Clear timer");
                    case 0 -> {System.out.println("Back");
                        islevelZeroFourFive = false;
                    }
                    default -> System.out.println("Invalid option");
        }  
                }
            
            }
            case 6 -> {
                boolean islevelZeroFourSix = true;

                while (islevelZeroFourSix) {
                                 System.out.println("Show call cost");
                        System.out.print(levelZeroFourSix);
                System.out.print("Enter an option: ");
                int numlevelZeroFourSix = input.nextInt();
                switch (numlevelZeroFourSix) {
                    case 1 -> System.out.println("Last call cost");
                    case 2 -> System.out.println("All call cost");
                    case 3 -> System.out.println("Clear counters");
                    case 0 -> {System.out.println("Back");
                        islevelZeroFourSix = false;
                    }
                    default -> System.out.println("Invalid option");
        }   
                }

            }
            case 7 -> { 
                boolean islevelZeroFourSeven = true;
                while (islevelZeroFourSeven) {
                 System.out.println("Call cost settings");
                 System.out.print(levelZeroFourSeven);
                System.out.print("Enter an option: ");
                int numlevelZeroFourSeven = input.nextInt();
                switch (numlevelZeroFourSeven) {
                    case 1 -> System.out.println("Call cost limit");
                    case 2 -> System.out.println("Show costs in");
                    case 0 -> {System.out.println("Back");
                        islevelZeroFourSeven = false;
                    }
                    default -> System.out.println("Invalid option");
        }   
                }
                
            }
            case 8 -> System.out.println("Prepaid Credit");
            case 0 -> System.out.println("Back");
            default -> System.out.println("Invalid option");
        }

            }
            case 5 -> {System.out.println("Tones selected");
                         System.out.print(levelZeroFive);
        System.out.print("Enter an option: ");
        int numlevelZeroFive = input.nextInt();
        switch (numlevelZeroFive) {
            case 1 -> System.out.println("Ringing tone");
            case 2 -> System.out.println("Ringing volume");
            case 3 -> System.out.println("Incoming call alert");
            case 4 -> System.out.println("Compose");
            case 5 -> System.out.println("Message alert tone");
            case 6 -> System.out.println("Keypad tone");
            case 7 -> System.out.println("Warning and game tones");
            case 8 -> System.out.println("Vibrating alert");
            case 9 -> System.out.println("Screen Saver");
            case 0 -> System.out.println("Back");
            default -> System.out.println("Invalid option");
        }

            }
            case 6 -> {System.out.println("Settings selected");

         System.out.print(levelZeroSix);
        System.out.print("Enter an option: ");
        int numlevelZeroSix = input.nextInt();
        switch (numlevelZeroSix) {
            case 1 -> {
                System.out.println("Call settings");
                System.out.print(levelZeroSixOne);
                System.out.print("Enter an option: ");
                int numlevelZeroSixOne = input.nextInt();
                switch (numlevelZeroSixOne) {
                    case 1 -> System.out.println("Automatic redial");
                    case 2 -> System.out.println("Speed dialing");
                    case 3 -> System.out.println("Call waiting options");
                    case 4 -> System.out.println("Own number sending");
                    case 5 -> System.out.println("Phone line in use");
                    case 6 -> System.out.println("Automatic answer");
                    case 0 -> System.out.println("Back");
                    default -> System.out.println("Invalid option");
        }
            }
            case 2 -> {
                System.out.println("Phone Settings");
                System.out.print(levelZeroSixTwo);
                System.out.print("Enter an option: ");
                int numlevelZeroSixTwo = input.nextInt();
                switch (numlevelZeroSixTwo) {
                    case 1 -> System.out.println("Language");
                    case 2 -> System.out.println("Cell info display");
                    case 3 -> System.out.println("Welcome note");
                    case 4 -> System.out.println("Network selection");
                    case 5 -> System.out.println("Lights");
                    case 6 -> System.out.println("Confirm SIM service selections");
                    case 0 -> System.out.println("Back");
                    default -> System.out.println("Invalid option");
        }
            }
            case 3 -> {
                System.out.println("Security Settings");
                System.out.print(levelZeroSixThree);
                System.out.print("Enter an option: ");
                int numlevelZeroSixThree = input.nextInt();
                switch (numlevelZeroSixThree) {
                    case 1 -> System.out.println("PIN code request");
                    case 2 -> System.out.println("Call bearing service");
                    case 3 -> System.out.println("Fixed dialling");
                    case 4 -> System.out.println("Closed user group");
                    case 5 -> System.out.println("Phone security");
                    case 6 -> System.out.println("Change access codes");
                    case 0 -> System.out.println("Back");
                    default -> System.out.println("Invalid option");
                }
            }
            case 4 -> System.out.println("Restore factory settings");
            case 0 -> System.out.println("Back");
            default -> System.out.println("Invalid option");
        }

            }
            case 7 -> System.out.println("Call Divert selected");
            case 8 -> System.out.println("Games selected");
            case 9 -> System.out.println("Calculator selected");
            case 10 -> System.out.println("Reminders selected");
            case 11 -> {System.out.println("Clock selected");
                         System.out.print(levelZeroEleven);
        System.out.print("Enter an option: ");
        int numlevelZeroEleven = input.nextInt();
        switch (numlevelZeroEleven) {
            case 1 -> System.out.println("Alarm clock");
            case 2 -> System.out.println("Clock settings");
            case 3 -> System.out.println("Date settings");
            case 4 -> System.out.println("Stopwatch");
            case 5 -> System.out.println("Countdown timer");
            case 6 -> System.out.println("Auto update of date and time");
            case 0 -> System.out.println("Back");
            default -> System.out.println("Invalid option");
        }
            }
            case 12 -> System.out.println("Profiles selected");
            case 13 -> System.out.println("SIM Services selected");
            case 0 -> System.out.println("End");
            default -> System.out.println("Invalid option");
        }





    }

    
}
