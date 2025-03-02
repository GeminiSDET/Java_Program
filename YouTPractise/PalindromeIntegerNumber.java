package YouTPractise;

import java.util.Scanner;

public class PalindromeIntegerNumber {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter num");
		int original = scanner.nextInt();
		scanner.close();
		
		int number=original;
		int reversed=0;
		
		while(number !=0) {
			int reminder=number%10;
			reversed=reversed*10+reminder;
			number=number/10;
		}
		if(original==reversed) {
			System.out.println(original + " is Plaindrome");
		}else {
			System.out.println(original + " is not Plaindrome");
		}
		

	}

}
