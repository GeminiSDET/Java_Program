package JavaProgramPractise;

public class SwapString {

	public static void main(String[] args) {
	
		String a="Hellow";
		String b= "World";
		
		a=a+b; //HelloWorld
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println(a);
		System.out.println(b);
	}
}
