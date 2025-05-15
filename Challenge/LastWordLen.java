package Challenge;

import java.util.Scanner;

public class LastWordLen {

	public static void main(String[] args) {
		
		/*
		 * 
		 * Input: s = "Hello World"
           Output: 5
		   Explanation: The last word is "World" with length 5
		 */
		   Scanner sc = new Scanner(System.in);
		   for (int i = 0; i < 3; i++) {
	       System.out.print("Enter the string:");
	       String s = sc.nextLine();

	       String[] split = s.trim().split("\\s+");  
	       String lastWord = split[split.length - 1];
	       

	        System.out.println(lastWord.length());
	    }
	}
}
	


