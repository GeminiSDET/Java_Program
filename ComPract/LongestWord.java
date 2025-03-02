package ComPract;

import java.util.Scanner;

public class LongestWord {

	public static String LongestWord(String sen) {
		String[] words=sen.replaceAll("[^a-zA-Z0-9]","").split(" ");
		String longestWord="";
		
		for(String word:words)
		{
			if(word.length()>longestWord.length())
			{
				longestWord=word;
			}
		}
		return longestWord;
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(LongestWord(sc.nextLine()));
	}

}
