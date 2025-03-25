package Day4;

public class ChangeOddIndex {

	public static void main(String[] args) {
		/*
		 * Change the odd index of a given String to uppercase with the input
		 * Convert the given String to a character array.
- Implement a loop to iterate through each character of the String (from end to start).
- Find the odd index within the loop
- Inside the loop, change the character to uppercase only if the index is odd
- Print the characters with the expected output: cHaNgEmE

 c h a n g e m e
 0 1 2 3 4 5 6 7
   H   N   E   E
		 */

		String test = "changeme";
		
		char[] input=test.toCharArray();
		System.out.println(input);
		
		for(int i=input.length-1;i>=0;i--)
		{
			if(i%2==1)
			{
				char temporaryvar = Character.toUpperCase(input[i]);
				System.out.println("Odd index changed from lowercase to Uppercase:"+temporaryvar);
			}
		}
		
		
		
		
	}

}
