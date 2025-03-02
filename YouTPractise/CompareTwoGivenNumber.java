package YouTPractise;

import java.util.Scanner;

public class CompareTwoGivenNumber {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter first number");
		int firstNumber = scanner.nextInt();
		System.out.println("Enter second number");
		int secondNumber = scanner.nextInt();
		scanner.close();
		
		if(firstNumber>secondNumber) {
			System.out.println(firstNumber + "greater then" +"secondNumber");
		}else if(firstNumber<secondNumber) {
			System.out.println(firstNumber+"less then"+ "secondNumber");
		}else if(firstNumber==secondNumber) {
			System.out.println(firstNumber + "="+secondNumber);
		}
	}
}
