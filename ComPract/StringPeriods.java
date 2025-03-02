package ComPract;

import java.util.Scanner;

public class StringPeriods {

	public static String StringPeriods(String str) {
		int n=str.length();
		
		for(int len=1;len<=n/2;len++)
		{
			if(n%len==0)
			{
				String subString=str.substring(0,len);
				StringBuilder rep=new StringBuilder();
				
				for(int i=0;i<n/len;i++)
				{
					rep.append(subString);
				}
				if(rep.toString().equals(str))
				{
					return subString;
				}
			}
		}
		return "-1";
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println(StringPeriods(sc.nextLine()));
	}

}
