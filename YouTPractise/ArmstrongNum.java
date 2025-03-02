package YouTPractise;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter num ");
		int num = scanner.nextInt();
		scanner.close();
		
		int original=num;
		int cubeNumber=0;
		
		while(num>0) {
			int reminder=num%10;
			cubeNumber=cubeNumber+(reminder*reminder*reminder);
			num=num/10;
		}
		if(original==cubeNumber) {
			System.out.println(original + " is Armstrong");
		}else {
			System.out.println(original + " is not Armstrong");
		}
	}

}
