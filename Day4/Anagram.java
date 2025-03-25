package Day4;

import java.util.Arrays;

public class Anagram {


	public static void main(String[] args) {
		
		
	String text1 = "stops"; 
	String text2 = "potss";
	int len1=text1.length();
	int len2=text2.length();
	
	if(len1==len2)
	{
		System.out.println("Both the string lengths are equal");
	}
	else
	{
		System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
	}
	
	char[] s1=text1.toCharArray();
	char[] s2=text2.toCharArray();
	
	Arrays.sort(s1);
	Arrays.sort(s2);
	
	System.out.println(Arrays.toString(s1));
	System.out.println(Arrays.toString(s2));
	
	if(Arrays.equals(s1, s2))
	{
		System.out.println("Both the strings are Anagram");
	}
	
	else
	{
		System.out.println("Both the strings are NOTAnagram");
	}
	
	
	
	
	}

}
