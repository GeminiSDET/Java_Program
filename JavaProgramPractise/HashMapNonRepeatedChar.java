package JavaProgramPractise;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapNonRepeatedChar {
	public static void main(String[] args) {
		String str="miss";
		
		Map<Character,Integer> map=new LinkedHashMap<>();
		//LinkedHashMap maintains insertion order
		int count=1;
		
		for(int i=0;i<str.length();i++)
		{
			if(!map.containsKey(str.charAt(i)))
			{
				map.put(str.charAt(i), count);
			}
			else
			{
				map.put(str.charAt(i),map.get(str.charAt(i))+1);
			}
		}
		for(Entry<Character,Integer> entry:map.entrySet())
		{
			if(entry.getValue()==1)
			{
				System.out.println("non-repeated char is:" +entry.getKey());
			}
		}
	}
}

