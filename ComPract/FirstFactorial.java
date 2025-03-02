package ComPract;

import java.util.Scanner;

public class FirstFactorial {
	
	public static int FirstFactorial(int num) {
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number: ");
		//int num=s.nextInt();
		System.out.println(FirstFactorial(s.nextInt()));
	}

}
