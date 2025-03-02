package YouTPractise;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter text");
		String original=scanner.nextLine(); 
		scanner.close();
		
		String rev="";
		
		for(int i=original.length()-1;i>=0;i--) {
			rev+= original.charAt(i);
		}
		if(original.equals(rev)) {
			System.out.println(original + " is Palindrome");
		}else {
			System.out.println(original + " is not Palindrome");
		}
	}
}
