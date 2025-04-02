package homeassignments.week3.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {

		int[] a={1, 2, 3, 4, 10, 6, 8};   //5,7,9
		
		List<Integer> element=new ArrayList<>();
		for(int x=0;x<a.length;x++)
		{
			element.add(a[x]);
		}
		
		Collections.sort(element);  //1,2,3,4,6,8,10
	
		for(int i=0;i<element.size()-1;i++)
		{
			int current=element.get(i);
			int next=element.get(i+1);
			
			for(int j=current+1;j<next;j++)
			{
				System.out.println(j);
			}
			
		}
		
		
		}
		
			
		}
		
	


