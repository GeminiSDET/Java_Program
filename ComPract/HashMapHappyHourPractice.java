package ComPract;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapHappyHourPractice {
	public static void main(String[] args) {
		String couponCode="happyishappy";
		System.out.println(happy(couponCode));
	}
	public static int happy(String couponCode) {
		Map<Character,Integer> map=new HashMap<>();
		map.put('h',1);
		map.put('a',1);
		map.put('p',2);
		map.put('y',1);
		
		Map<Character,Integer> map1=new HashMap<>();
		for(char ch:couponCode.toCharArray()) {
			map1.put(ch, map1.getOrDefault(ch,0)+1);
		}
		int maxDesserts=Integer.MAX_VALUE;
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			char ch=entry.getKey();
			int req=entry.getValue();
			
			if(!map1.containsKey(ch)) {
				return 0;
			}
			maxDesserts=Math.min(maxDesserts,map1.get(ch)/req);
		}
		return maxDesserts;	
	}
}
