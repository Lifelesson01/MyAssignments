package Day4;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String test = "I am a software tester";
		
		
		/*Split the words and have it in an array 
		 * - Traverse through each word using loop 
		 * - Find the odd index within the loop 
		 * - Convert the String array into a character array 
		 * - Print the even position words using another loop
		 * op:“I ma a erawtfos tester
		 * 
		 * I am a Software   t  e s    t    e   r
		 * 0 12 3 4567891011 12 13 14 15    16  17
		 * */
		 
		
		String[] words=test.split(" ");
		System.out.println(words);
	for(int i=0;i<words.length;i++)
	{
		
		if(i%2==1)
		{
			char[] wordchar=words[i].toCharArray();
			
for(int k=0;k<=wordchar.length-1;k++)
{
	System.out.println(wordchar[k]);
}
	
		
		}
		/*else if(i%2==0)
		{
			System.out.println(wordchar[i]);
		}
		else
		{
			System.out.println("Nothing");
		}  */
	}
		
	}

}
