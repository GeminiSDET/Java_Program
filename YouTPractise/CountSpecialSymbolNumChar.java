package YouTPractise;
import java.util.Scanner;

public class CountSpecialSymbolNumChar {
	public static void main(String[] args) {
	
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any text");
		String str=scanner.nextLine();
		char[] arr=str.toCharArray();
		
		int digits=0;
		int letters=0;
		int space=0;
		int others=0;
		
		for(Character c:arr){
			if(Character.isDigit(c)) {
				digits++;
			}else if(Character.isLetter(c)) {
				letters++;
			}else if(Character.isSpaceChar(c)) {
				space++;
			}else {
				others++;
			}
		}
		System.out.println("Num of digits " + digits);
		System.out.println("Num of letters " + letters);
		System.out.println("Num of spaces " + space);
		System.out.println("Num of other char " + others);
	}

}
