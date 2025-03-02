package ComPract;
import java.util.Scanner;
public class CamelCase {

//	Have the function CamelCase (str) take the str parameter being passed and return 
//	it in proper camel case format where the first letter of each word is capitalized
//	(excluding the first letter). The string will only contain letters and some combination 
//	of delimiter punctuation characters separating each word.
//	For example: if str is "BOB loves-coding" then your program should return the string
//	bobLovesCoding.
	
//	Examples
//	Input: "cats AND*Dogs-are Awesome"
//	Output: catsAndDogsAreAwesome
	
//	Input: "a b c d-e-f%g"
//	Output: aBCDEFG
	public static String CamelCase(String str) {
		
		String[] words=str.split("[^a-zA-Z0-9]+");
		StringBuilder result=new StringBuilder();
		
		if(words.length>0)
		{
			result.append(words[0].toLowerCase());
		}
		for(int i=1;i<words.length;i++)
		{
			if(!words[i].isEmpty())
			{
				result.append(words[i].substring(0,1).toUpperCase())
				.append(words[i].substring(1).toLowerCase());
			}
		}
		return result.toString();
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter char: ");
		System.out.println(CamelCase(s.nextLine()));
	}
}
