package JavaProgramPractise;
import java.util.HashMap;
import java.util.Map;
public class HashMapCharCount {

	public static void getCharCount(String name)
	{
		Map<Character,Integer> map=new HashMap<>();
		char strArray[]=name.toCharArray();
		
		for(char c:strArray)
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
			{
				map.put(c,1);
			}
		}
		System.out.println(name + ":" +map);
	}
	public static void main(String[] args) {
		getCharCount("test");
		getCharCount("I am learning java");
	}
}
