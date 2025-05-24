package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSorting {

	public static void main(String[] args) {
		
		List<String> str=new ArrayList<String>(Arrays.asList("HCL","Wipro","Aspire Systems","CTS"));
		Collections.sort(str);
		for(int i=str.size()-1;i>=0;i--) {
			System.out.println(str.get(i));
		}
	}

}
