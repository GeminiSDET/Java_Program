package YouTPractise;
import java.util.Scanner;

public class FibonacciSeriesOfNum {
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter num");
		int num=scanner.nextInt();
		scanner.close();
		
		int a=1,b=1;
		int f=0;
		
		System.out.println(a+ " ");
		System.out.println(b+ " ");
		
		while(f<=num) {
			f=a+b;
			System.out.println(f+ " ");
			
			a=b;
			b=f;
		}
	}
}
