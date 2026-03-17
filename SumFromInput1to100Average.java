import java.util.Scanner;

public class SumFromInput1to100Average {
    
    public static void main(String[] args) {
        
		Scanner input = new Scanner(System.in);

		int sum = 0;

		int counter = 0;

		for(int i = 1; i<=10; i++){
		
		System.out.println("Enter a number (0 - 100) :");

		int a = input.nextInt();
		if(a > 100 || a < 0){
		System.out.println("you just entered an invalid number");
		//System.out.println("Try Again");
		//i--;
			}else{
		sum = sum + a;
		counter += 1;
		
		}
			
		}
	System.out.println("Average of the 10 Valid input: " + sum/counter); 
    }
}
