package YouTPractise;
import java.util.Scanner;

public class CountNumberOfDigit {
	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter num ");
		int num = scanner.nextInt();
		scanner.close();
		
		int digitCount=0;
		
		while(num>0) {
			digitCount++;
			num=num/10;
		}
		System.out.println("num of digit in the given number is: "+ digitCount);
	}
}
