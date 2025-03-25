package Day4;
 
import java.lang.String;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
	
		String text = "We learn Java basics as part of java sessions in java week1";
		
		int count=0;
		String[] testarray = text.split(" ");
		System.out.println(testarray);
		
		for(int i=0;i<testarray.length;i++)
		{
			for(int j=i+1;j<testarray.length;j++)
			{
				if(testarray[i].equalsIgnoreCase(testarray[j]))
						{
							testarray[j]=" ";
							count=count+1;
						}
			}
		}
		
		for(int k=0;k<testarray.length;k++)
		{
			System.out.println(testarray[k]);
		}

	}

}
