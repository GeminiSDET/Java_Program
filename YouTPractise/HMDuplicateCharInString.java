package YouTPractise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HMDuplicateCharInString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		
		char[] ca=str.toCharArray();
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(Character c:ca) {
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}else {
				map.put(c,1);
			}
		}
		for(Character c:map.keySet()) {
			if(map.get(c)>1) {
				System.out.println(c + " repeated " +  map.get(c));
			}
		}
	}
}
