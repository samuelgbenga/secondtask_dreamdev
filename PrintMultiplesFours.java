public class PrintMultiplesFours {
    
    public static void main(String[] args) {
        

		for(int i = 1; i<=10; i++){

		if(i%4==0){
		int result = 1;
		for(int j=1; j<=5; j++){
			result = result * i;
			System.out.println(result);

				}}
			
		} 
    }
}
