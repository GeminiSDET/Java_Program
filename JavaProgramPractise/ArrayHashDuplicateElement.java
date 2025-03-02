package JavaProgramPractise;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;
public class ArrayHashDuplicateElement {
	public static void main(String[] args) {
		
		//1. Using Hash Set
		String names[]= {"Java","C","Python","Java"};	
		Set<String> set=new HashSet<String>();
		for(String name:names)
		{
			if(set.add(name)==false)
			{
				System.out.println(name);
			}
		}		
		//2. HashMap
		HashMap<String,Integer> map=new HashMap<String,Integer>();			
		for(String name:names)
		{
			Integer count=map.get(name);
			if(count == null)
			{
				map.put(name, 1);
			}
			else
			{
				map.put(name, ++count);
			}
		}
		Set<Entry<String,Integer>> entrySet=map.entrySet();
		for(Entry<String,Integer> entry:entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey());
			}
		}	
		//3. HashMap	
        HashMap<String, Integer> nameCountMap = new HashMap<>();
        for (String name : names)
        {
            if (nameCountMap.containsKey(name))
            {
                nameCountMap.put(name, nameCountMap.get(name) + 1);
            } else
            {
                nameCountMap.put(name, 1);
            }
        }     
        System.out.println("Occurrences of each name:");
        for (String key : nameCountMap.keySet()) 
        {
            System.out.println(key + ": " + nameCountMap.get(key));
        }
	}
}
