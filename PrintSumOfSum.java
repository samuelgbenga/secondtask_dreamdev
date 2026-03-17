public class PrintSumOfSum {
    
    public static void main(String[] args) {
        
		int finalSum = 0;
		for(int i = 1; i<=10; i++){
		
		if(i%4==0){
		int result = 1;
		int sum = 0;
		for(int j=1; j<=5; j++){
			result = result * i;
			sum = sum + result;
			//System.out.println(result);

				}
		//System.out.println(sum);
		finalSum = finalSum + sum;			
}
			//System.out.println(finalSum);
		} 
		System.out.println(finalSum);
    }
}
