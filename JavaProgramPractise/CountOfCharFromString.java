package JavaProgramPractise;

public class CountOfCharFromString {

	public static void main(String[] args) {
		String str="Java is object oriented Program";
		
		int result=str.length()-str.replaceAll("a", "").length();
		System.out.println(result);
	}

}
