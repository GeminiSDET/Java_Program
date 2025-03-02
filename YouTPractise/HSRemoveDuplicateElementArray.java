package YouTPractise;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HSRemoveDuplicateElementArray {

	public static void main(String[] args) {
		int[] arr= {2,2,6,5,8,9,5,7};
		
		Set<Integer> set= new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		Integer[] b=set.toArray(new Integer[set.size()]);

		System.out.println(Arrays.toString(b));
	}

}
