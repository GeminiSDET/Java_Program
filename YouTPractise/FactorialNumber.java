package YouTPractise;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter num ");
		int num = scanner.nextInt();
		scanner.close();
		
		int fact=factorial(num);
		System.out.println(fact);

	}
	public static int factorial(int num) {
		if(num==0) {
			return 1;
		}else {
			return num*factorial(num-1);
		}		
	}

}
