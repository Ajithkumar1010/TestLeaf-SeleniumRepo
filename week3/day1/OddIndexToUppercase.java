package week3.day1;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		
		String str="changeme";
		char ch[]=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			if(i%2!=0) {
				System.out.print((ch[i-1]));
				System.out.print(Character.toUpperCase(ch[i])); 
			}
			
		}

	}

}
