import java.util.Scanner;

public class Flip {

     public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

	System.out.println("Enter a number between (0 or 1):");

    int num = input.nextInt();

    
	if(num == 0) System.out.println(1);
	if(num == 1) System.out.println(0);
	if(num != 0 && num != 1 ) System.out.println("You number is not in the option");
	 

}

}