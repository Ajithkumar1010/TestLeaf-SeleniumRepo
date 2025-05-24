package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		
		List<Integer> arr1=new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 10, 6, 8));
		
		Collections.sort(arr1);
		
		for (int i = 0; i < arr1.size()-1; i++) {
			
			if(arr1.get(i+1) != arr1.get(i)+1) {
				System.out.println(arr1.get(i)+1);
			}
			
		}

	}

}
