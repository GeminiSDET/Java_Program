package JavaProgramPractise;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringRemoveDuplicate {
	public static void main(String[] args) {

		String str="coconut";
		Set<Character> set= new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		StringBuffer sb=new StringBuffer();
		for(Character c:set)
		{
			sb.append(c);
		}
		System.out.println(sb);
	}
}
