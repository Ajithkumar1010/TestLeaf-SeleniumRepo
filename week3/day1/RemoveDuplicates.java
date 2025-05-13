package week3.day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String s="We learn Java basics as part of java sessions in java week1";
		String split[]=s.split(" ");
		
		for (int i = 0; i < split.length; i++) {
			boolean isDuplicate = false;
			for (int j =0; j < i; j++) {
				
			if(split[i].equalsIgnoreCase(split[j])) {
				
				isDuplicate = true;
				break;
			}	
			}
			if(isDuplicate) {
				System.out.println(" ");
		}
			else{
				System.out.print(split[i]+" ");	
			}
			
		}
		


	}

}
