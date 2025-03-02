package ComPract;

import java.util.Scanner;

//String Decoding
//A person has a string S of length N.
//The person applied the following list of modifications in the given order on the string
//1. Shift each character to the right in a cyclic fashion (i.e., changing all a to b, all b to c... all z to a).
//2. The entire string is reversed.

//You are given the string S after all the modifications.

//Find the original string, i.e., the original string, before the modification.

//Function Description
//In the provided code snippet, implement the provided stringDecoding(...) method to find the original string, 
//i.e., the original string, before the modification. You can write your code in the space below the phrase "WRITE YOUR LOGIC HERE"
//There will be multiple test cases running so the Input and Output should match exactly as provided The base output variable
//result is set to a default value of -404 which can be modified. Additionally you can add or remove these output variables.

//Input Format
//The first line contains a single integer N, denoting the length of string S.
//The second line contains a string, S

//Sample Input
//5     -- denotes N
//abcde -- denotes S

//Constraints
//1<=N <= 100
//String S contains English alphabets only.

//Output Format
//The output contains a single string denoting the original string, i.e., the original string, before the modification.
//Sample Output
//debaz

public class StringDeCoding {

	public static String stringDecode(int N,String S)
	{
		String result="";
		StringBuilder reversedString=new StringBuilder(S).reverse();
		StringBuilder originalString=new StringBuilder();
		
		for(int i=0;i<N;i++)
		{
			char currentChar=reversedString.charAt(i);
			char shiftedChar;
			
			if(currentChar=='a')
			{
				shiftedChar='z';
			}
			else
			{
				shiftedChar=(char)(currentChar-1);
			}
			originalString.append(shiftedChar);
		}
		result=originalString.toString();
		return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.nextLine();
		String S=sc.nextLine();
		
		System.out.println(stringDecode(N,S));
	}
}
