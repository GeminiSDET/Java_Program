package YouTPractise;

import java.util.Scanner;

public class FindSquareOfNumber {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter num ");
		int num = scanner.nextInt();
		scanner.close();
		
		System.out.println("square of num " + (num*num));
	}

}
