package JavaProgramPractise;
public class ReverseEveryWordString {
	public static void main(String[] args) {
		
		String str="How are you";
		
		String result="";
		String[] arr=str.split(" ");
		for(String word:arr)
		{
			String reverseWord="";
			int j=word.length();
			while(j>0)
			{
				char ch=word.charAt(j-1);
				reverseWord+=ch;
				j--;
			}
			result+=reverseWord+" ";
		}
		System.out.println(result);
	}
}
		
