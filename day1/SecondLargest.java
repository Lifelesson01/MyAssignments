package homeassignments.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {

		int[] a={3, 2, 11, 4, 6, 7};
		
	
		
		List<Integer> largest=new ArrayList<>();
		
		for(int i=0;i<a.length;i++)
		{
			largest.add(a[i]);
		}
		
		System.out.println("List values are:"+largest);
		Collections.sort(largest);
		int secondlarge=largest.get(largest.size()-2);
		
		System.out.println("Second largest number is:"+secondlarge);
		
		
	}
}
