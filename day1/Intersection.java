package homeassignments.week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Intersection {

	public static void main(String[] args) {
		// Find intersection of numbers using list interface

		int[] a= {3, 2, 11, 4, 6, 7};
		int[] b= {1, 2, 8, 4, 9, 7};
		
		List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        
		
		
        for(int i=0;i<a.length;i++)
        {
        	list1.add(a[i]);
        	
        }
        
        for(int j=0;j<b.length;j++)
        {
        	list2.add(b[j]);
        }
        
        Collections.sort(list1);  // 2,3,4,6,7,11
        Collections.sort(list2);  // 1,2,4,7,8,9
        List<Integer> intersection = new ArrayList<>();
        
        for(int i=0;i<list1.size();i++)
        {
        	for(int j=0;j<list2.size();j++)
        	{
        		if((list1.get(i)).equals(list2.get(j)))
        		{
        			intersection.add(list1.get(i));
        		}
        	}
        }
        
        System.out.println("INtersection of two numbers:"+intersection);

	}

}
