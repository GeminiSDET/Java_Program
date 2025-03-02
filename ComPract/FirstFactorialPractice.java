package ComPract;
import java.util.Scanner;

public class FirstFactorialPractice {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter num: ");
		int num = scanner.nextInt();
		System.out.println(FirstFactorial(num));
	}
	public static int FirstFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact*=i;
		}
		return fact;
	}
}
