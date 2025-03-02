package YouTPractise;
import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = scanner.nextInt();
		scanner.close();
		
		int sumOfDigits=0;
		while(num>0) {
			int reminder=num%10;
			sumOfDigits+=reminder;
			num=num/10;
		}
		System.out.println("Sum of digit is : " + sumOfDigits);
	}

}
