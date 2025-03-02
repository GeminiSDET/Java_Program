package JavaProgramPractise;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetRemoveDuplicateWord {
	public static void main(String[] args) {
		
		String str="I am azar azar";
		String[] strArray=str.split(" ");
		
		Set<String> set=new LinkedHashSet<>();
//to maintain the order in sequence,LinkedHashSet is used
		
		for(String x:strArray)
		{
			set.add(x);
		}
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " ");
		}
	}
}
