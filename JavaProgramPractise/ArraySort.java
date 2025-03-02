package JavaProgramPractise;

import java.util.Arrays;

public class ArraySort {
	public static void main(String[] args) {
	
		String str="program";
		
		char[] charArray=str.toCharArray();
		Arrays.sort(charArray);
		
		String sortArray=new String(charArray);
		System.out.println(sortArray);
	}
}
