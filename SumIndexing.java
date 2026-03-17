import java.util.Scanner;

public class SumIndexing {
    
    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);
		
		int sum = 0;		

		for(int i = 1; i<=10; i++){

		System.out.println("Enter a number:");

		int a = input.nextInt();

		if(i%2==0)sum = sum + a;
			
		}
	System.out.println("Sum of 10 inputs: " + sum); 
    }
}
