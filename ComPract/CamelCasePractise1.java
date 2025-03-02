package ComPract;
import java.util.Scanner;

public class CamelCasePractise1 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter num: ");
		System.out.println(CamelCase(scanner.nextLine()));
	}
	public static String CamelCase(String str) {
		String[] word=str.split("[^a-zA-Z0-9]+");
		StringBuilder result=new StringBuilder();
		
		if(word.length>0) {
			result.append(word[0].toLowerCase());
		}
		for(int i=1;i<word.length;i++) {
			if(!word[i].isEmpty()) {
				result.append(word[i].substring(0,1).toUpperCase())
				.append(word[i].substring(1).toLowerCase());
			}
		}
		return result.toString();	
	}
}

