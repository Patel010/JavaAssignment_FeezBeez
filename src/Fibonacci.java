
public class Fibonacci {

	
	public static int fibonacci (int number ){
		if (number == 1 || number == 2){
			
			return 1;
		}
		
		return fibonacci (number -1) + fibonacci (number -2);
	}
	
	public static void main(String[] args) {
		
		int number = 9;
		
		for (int i=1; i<=number ; i++){
			
			System.out.println(i + " :" + fibonacci(i) + " ");
		}
		


	}

}
