package week1.day2;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// Change Odd Indexes ToUpperCase
		
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 1; i < charArray.length; i++) {
			if(i%2!=0)
				charArray [i]=Character.toUpperCase(charArray[i]);			
		}
		
		System.out.println(charArray);
	}

}
