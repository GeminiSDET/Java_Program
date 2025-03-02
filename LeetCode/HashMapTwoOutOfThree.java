package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMapTwoOutOfThree {
//Not Clear-https://leetcode.com/problems/two-out-of-three/?envType=problem-list-v2&envId=hash-table
	public static List<Integer> twoOutOfThree(int[] nums1,int[] nums2,int[] nums3){
		
		Map<Integer,Integer> freqMap=new HashMap<>();
		
		addElements(nums1,freqMap);
		addElements(nums2,freqMap);
		addElements(nums3,freqMap);
		
		List<Integer> result=new ArrayList<>();
		for(Map.Entry<Integer,Integer> entry:freqMap.entrySet()) {
			if(entry.getValue() >= 2)
			{
				result.add(entry.getKey());
			}
		}
		return result;
		
	}
	
	public static void addElements(int[] nums,Map<Integer,Integer> map) {
		Set<Integer> uniqueElements=new HashSet<>();
		for(int num:nums)
		{
			uniqueElements.add(num);
		}
		for(int num:uniqueElements)
		{
			map.put(num, map.getOrDefault(num,0)+1);
		}
	}
	
	public static void main(String[] args) {

		int[] nums1= {1,1,3,2};
		int[] nums2= {2,3};
		int[] nums3= {3};
		
		List<Integer> result=twoOutOfThree(nums1,nums2,nums3);
		System.out.println(result);
	}

}
