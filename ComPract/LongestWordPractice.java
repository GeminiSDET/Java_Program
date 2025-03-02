package ComPract;
import java.util.Scanner;

public class LongestWordPractice {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println(LongestWord(scanner.nextLine()));
	}
	public static String LongestWord(String str) {
		String[] word=str.replaceAll("[^a-zA-Z0-9]", "").split(" ");
		String longestWord=" ";
		for(String wd:word) {
			if(wd.length()>longestWord.length()){
				longestWord=wd;
			}
		}
		return longestWord;	
	}
}
