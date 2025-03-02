package JavaProgramPractise;
public class Fibonacci {
	public static void main(String[] args)
	{
		int terms = 10;

		System.out.println("Fibonacci to " + terms + " terms:");
		printFibonacciSeries(terms);
	}

	public static void printFibonacciSeries(int terms) 
	{
		int first = 0, second = 1;

		for (int i = 1; i <= terms; i++) 
		{
			System.out.print(first + " ");
			int next = first + second;
			first = second;
			second = next;
		}
	}
}
