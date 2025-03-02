package JavaProgramPractise;

import java.util.HashMap;

public class HashMapAverageAge {
	public static void main(String[] args) {
		
		HashMap<String,Integer> ageMap=new HashMap<>();
		ageMap.put("Ravi", 30);
		ageMap.put("Rizwan", 34);
		ageMap.put("Mansi", 32);
		
		int totalAge=0;
		for(int age:ageMap.values())
		{
			totalAge+=age;
		}
		System.out.println(totalAge/(double)ageMap.size());
	}
}
