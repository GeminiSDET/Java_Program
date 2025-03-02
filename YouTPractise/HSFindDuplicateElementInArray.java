package YouTPractise;

import java.util.HashSet;

public class HSFindDuplicateElementInArray {

	public static void main(String[] args) {
		int a[]= {2,2,5,5,6,8,7,9};
		
		HashSet<Integer> set=new HashSet<>();
		for(int i=0;i<a.length;i++) {
			if(set.add(a[i])==false) {
				System.out.println(a[i] + " is duplicated");
			}
		}

	}

}
