package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		
		int input=121;
		int output=input;
		int rem;
		int sum=0;
		
		while(input>0) {
		rem=input%10;
		input=input/10;
		sum=sum*10+rem;
		}
		
		if(sum==output) {
			System.out.println(output+" is palindrome");
		}
		else{
			System.out.println(output + " is not palindrome");
		}
		}	
	}


