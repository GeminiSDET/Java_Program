package ComPract;

import java.util.HashMap;
import java.util.Map;

//Happy hours
//You and your family ere at a restaurant to have dinner. You visited the restaurant during the Happy Hours offer 
//therefore restaurant is offering you a coupon code that will give you free desserts. 
//You will get free dessert every time you form the word happy using the letters of the coupon code, 
//every letter can be used only once You are given a String coupon code which comprises lowercase English alphabets

//Find the maximum number of tree desserts that you can get during the happy hours using the Coupon-code

//Examples
//If the input string is happyishappy, you can form the word happy twice, thus claiming two free desserts.
//If the input string is puppyheaven, you can form the word happy once. thus claiming one free dessert

//Function description
//Complete the Solved Function. This function takes the following argument and finds the maximum number of free desserts 
//that you can get during happy hours

//* Coupon Code Represents input string which comprises lowercase English alphabets
//Input format for custom testing
//* The first line contains a string Coupon, Code which comprises lowercase English alphabets

//Output format
//Return the maximum number of tree desserts that you can get during the happy hours

//Constraints
//a ≤ Cospon.Codel4 ≤ a
//O S len (Coupon Code) ≤ 10%

//Sample input
//NEE
//Sample output
//happytskana


public class HashMapHappyHour {

	public static int solve(String couponCode) {
		Map<Character,Integer> hp=new HashMap<>();
		hp.put('h',1);
		hp.put('a',1);
		hp.put('p',2);
		hp.put('y',1);
		
		Map<Character,Integer> cp=new HashMap<>();
		for(char ch:couponCode.toCharArray())
		{
			cp.put(ch, cp.getOrDefault(ch, 0)+1);
		}
		int maxDesserts=Integer.MAX_VALUE;
		for(Map.Entry<Character,Integer> entry:hp.entrySet())
		{
			char ch=entry.getKey();
			int required=entry.getValue();
			
			if(!cp.containsKey(ch))
			{
				return 0;
			}
			maxDesserts=Math.min(maxDesserts,cp.get(ch)/required);
		}
		return maxDesserts;
		
	}
	public static void main(String[] args) {
		String couponCode="happyishappy";
		System.out.println(solve(couponCode));
	}
}
