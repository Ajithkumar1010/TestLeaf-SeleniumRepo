package week3.day1;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String s="I am a software tester"; 
		String [] words= s.split(" ");
		
		for(int i=0;i<words.length;i++) {
			if(i%2!=0) {
				words[i]=new StringBuilder(words[i]).reverse().toString();
			}
		}
	
		String result= String.join(" ", words);
		
		System.out.println(result);

}
}
