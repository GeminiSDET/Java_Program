package JavaProgramPractise;

public class StringExtract {

	public static void main(String[] args) {
		
		String str="www.eros.com";
		
		String firstFour=str.substring(0,4);
		String lastFour=str.substring(8,12);
		String mid=str.substring(4,8);
		
		System.out.println(firstFour);
		System.out.println(lastFour);
		System.out.println(mid);
	}

}
