package YouTPractise;

import java.util.Scanner;

public class CubeNumber {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter num ");
		int num = scanner.nextInt();
		scanner.close();
		
		System.out.println("Cube of num is " + (num*num*num));

	}

}
