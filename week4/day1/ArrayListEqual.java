package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEqual {

	public static void main(String[] args) {
		
		List<Integer> arr1= new ArrayList<Integer>(Arrays.asList(3, 2, 11, 4, 6, 7));
		
		List<Integer> arr2= new ArrayList<Integer>(Arrays.asList(1, 2, 8, 4, 9, 7));
		
	    for(int i=0;i<arr1.size();i++) {
		    for(int j=0;j<arr2.size();j++) {
			        if(arr1.get(i).equals(arr2.get(j))){
				           System.out.println(arr1.get(i));
			                   }
				
			                 }
		                 }
	               }
	      }

