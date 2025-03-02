package JavaProgramPractise;

public class ReverseIntegerStringBuffer {

	public static void main(String[] args) {
		
		int num=12345678;	
		System.out.println(new StringBuffer(String.valueOf(num)).reverse());
	}
}
