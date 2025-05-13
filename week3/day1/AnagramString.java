package week3.day1;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		
		String s1 = "stops";  
		String s2 = "potss" ;
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("given string is anagram");
		}
		
		else{
			System.out.println("given string is not a anagram");
		}
		
	}

}
