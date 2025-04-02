package homeassignments.week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting {

	public static void main(String[] args) {
		/*  Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS} 
		 * Add the collection to a list
		 *  Iterate the values in the list 
		 *  Print the required output as Wipro, HCL, CTS, Aspire Systems
		 */
		
		
		
		String[] companies={"HCL", "Wipro", "Aspire Systems", "CTS"};
		
		List<String> sorttest=new ArrayList<String>();
		
		for(int i=0;i<companies.length;i++)
		{
			sorttest.add(companies[i]);
		}
		
		System.out.println("Companies are available in the list:"+sorttest);
		
		Collections.sort(sorttest);   //AS CTS HCL W
		
		//List<String> sortreverse=new ArrayList<String>();
		
		for(int j=sorttest.size()-1;j>=0;j--)
		{
			
			System.out.println("Reversed Elements are:"+sorttest.get(j));
		}

	}

}
