package JavaProgramPractise;
public class primeNumber {
	public static boolean isPrimeNumber(int num){
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int start = 1;
		int end = 50;

		System.out.println("Prime no between " + start + " and " + end + " are:");

		for (int num = start; num <= end; num++) {
			if (isPrimeNumber(num)) {
				System.out.print(num + " ");
			}
		}
	}
}
