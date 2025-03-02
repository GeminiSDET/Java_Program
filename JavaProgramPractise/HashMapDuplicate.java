package JavaProgramPractise;

import java.util.HashMap;
import java.util.Map;

public class HashMapDuplicate {

	public static boolean containsDuplicate(int[] nums)
	{
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++)
		{
			if(map.containsKey(nums[i]))
			{
				return true;
			}
			else
			{
				map.put(nums[i], i);
			}	
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] nums= {1,2,3,2,4};
		System.out.println(containsDuplicate(nums));
	}
}
