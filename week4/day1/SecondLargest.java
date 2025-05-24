package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {

		List<Integer> arr1= new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		
		Collections.sort(arr1);
		
		System.out.println(arr1.get(arr1.size()-2));

	}

}
