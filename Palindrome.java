package week1.day2;

public class Palindrome {

	//private static String string;

	public static void main(String[] args) {
		// To find the given string is palindrome or not
		
		String input="Madam";
		String rev="";
		int length = input.length();
		char[] charArray = input.toCharArray();
		for (int i = length-1; i>=0 ; i--) {
			rev= rev + charArray[i];
		   	}
		
		if(input.toLowerCase().equalsIgnoreCase(rev))
			System.out.println("Given string is a palindrome");
		else
			System.out.println("Given string is not a palindrome");

	}

}
