public class ReverseNumber {

//This programe called Pelindrome
	public static void main(String[] args) {
		int number = 121;
		int reveseNo = reverseNumber(number);

		if (number == reveseNo) {
			System.out.println("Palindrome...");
		} else {
			System.out.println("Not Palindrome...");

		}
	}

	public static int reverseNumber(int number) {

		int reverseNumber = 0;
		
		while (number > 0) {
			System.out.println("Original number " + number);
			
			reverseNumber = reverseNumber * 10 + number%10;
			
			System.out.println("remainder" + number%10);
			
			number = number / 10;
			
            System.out.println("Changed number " + number);
            System.out.println("ReverseNumber " + reverseNumber);
            
		}
		return reverseNumber;
	}
}
