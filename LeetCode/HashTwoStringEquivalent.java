package LeetCode;

public class HashTwoStringEquivalent {

	public static void main(String[] args) {
//https://leetcode.com/problems/check-whether-two-strings-are-almost-equivalent/?envType=problem-list-v2&envId=hash-table
		String word1="abcdeef";
		String word2="abaaacc";

		System.out.println(EquivString(word1,word2));
	}
	
	public static boolean EquivString(String word1,String word2) {
		
		int len=word1.length();
		int[] freq=new int[26];
		
		for(int i=0;i<len;i++)
		{
			freq[word1.charAt(i)-'a']++;
			freq[word2.charAt(i)-'a']--;
		}
		for(int i=0;i<26;i++)
		{
			if(Math.abs(freq[i])>3)
			{
				return false;
			}
		}
		return true;
		
	}

}
