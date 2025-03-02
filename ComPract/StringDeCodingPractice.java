package ComPract;
import java.util.Scanner;

public class StringDeCodingPractice {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N = scanner.nextInt();
		scanner.nextLine();
		String S=scanner.nextLine();
		System.out.println(stringDecode(N,S));
	}
	public static String stringDecode(int N,String S) {
		String result ="";
		StringBuilder revString=new StringBuilder(S).reverse();
		StringBuilder orgString=new StringBuilder();
		
		for(int i=0;i<N;i++) {
			char currentChar=revString.charAt(i);
			char shiftedChar;
			
			if(currentChar=='a') {
				shiftedChar='z';
			}else {
				shiftedChar=(char)(currentChar-1);
			}
			orgString.append(shiftedChar);
		}
		result=orgString.toString();		
		return result;	
	}
}

