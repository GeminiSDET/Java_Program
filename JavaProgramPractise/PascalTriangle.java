package JavaProgramPractise;

public class PascalTriangle {

	public static void main(String[] args) {
		int numRows = 6; // Change this to generate more rows
		generatePascalsTriangle(numRows);

	}

	public static void generatePascalsTriangle(int numRows) {
		for (int i = 0; i < numRows; i++) {
			int number = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}
}