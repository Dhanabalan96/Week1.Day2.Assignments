package week1.day2;

import java.util.Arrays;

public class ReverseEvenWords {

	public static void main(String[] args) {
		//Build a logic to reverse the even position words
		
		/* 1. Declare a string input
		 * 2. Split string input in to string array
		 * 3. Iterate over string array
		 * 4. if i=1,3,5 (even position words) do split strings to char array
		 * 5. iterate chararray using another for loop in reverse order
		 * 6. set reversed value to  string array
		 * 7. print string array
		 * 
		 */
    String test = "I am a software tester";
    String rev;
    String[] split = test.split(" ");

    int length = split.length;
    for (int i = 1; i < length; i++)
    {   
    	if(i%2!=0)
    	{   
    		rev="";
    		char[] Wordsplit = split[i].toCharArray();
    		for (int j = Wordsplit.length-1; j>=0; j--) 
    		{	
    		    rev= rev+ Wordsplit[j];
    		    split[i]=rev;
			}
  
    	}
	}
    // System.out.print(split);
     for (String words : split) 
     {
	    System.out.print(words+" ");
     }
    
  }

}
