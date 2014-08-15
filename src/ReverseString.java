
public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		String str = "My name is Mehul !!";
		System.out.println(str);
		
		String reverseStr = new StringBuffer (str).reverse().toString();
		
		System.out.println("Reversed Strin is: "+ reverseStr);

	}

}
