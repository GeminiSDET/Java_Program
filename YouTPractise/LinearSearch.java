package YouTPractise;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
	
		int arr[]= {55,85,6,21,9,55,74,85,86,62,54};
		
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		scanner.close();
		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				System.out.println("Num " + num+" is avaiable at index " + i);
			}
		}
		if(count==0)
		{
			System.out.println("Num is not avaiable");
		}
				

	}

}
