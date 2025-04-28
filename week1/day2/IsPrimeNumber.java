package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		int num=13;
		int count=0;
		
		for(int i=2;i<=num/2;i++) {
			if(num%2==0) {
				count++;
			}	
		}
		
		if(count>0) {
			System.out.println(num +" is not a prime num");
		}
		else {
			System.out.println(num +" is prime num");
		}
	}

}
