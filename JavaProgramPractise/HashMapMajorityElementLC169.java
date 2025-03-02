package JavaProgramPractise;
import java.util.HashMap;
public class HashMapMajorityElementLC169 
{
	public static int MajorityElement(int[] nums) 
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : nums)
		{
			map.put(num, map.getOrDefault(num, 0) + 1);

			if (map.get(num) > nums.length / 2) 
			{
				return num;
			}
		}
		throw new IllegalArgumentException("No majority found");
	}
	
	
	public static void main(String[] args) 
	{
		int[] nums1 = { 3, 2, 3 };
		System.out.println(MajorityElement(nums1));
	}
}

