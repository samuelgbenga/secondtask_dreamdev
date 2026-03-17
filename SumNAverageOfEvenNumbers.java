import java.util.Scanner;

public class AverageOfEvenInputs {

    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                int sum = 0;
                int totalNumberOfOdd = 0;

                for(int i = 1; i<=10; i++){

                System.out.println("Enter a number:");

                int a = input.nextInt();

                if(a%2==0){sum = sum + a;
                        totalNumberOfOdd += 1;
                        }

                }
	System.out.println("Sum of Even Numbers: "+ sum);
        System.out.println("Average of Sum of Everage Numbers : " + sum/totalNumberOfOdd);
    }
}
