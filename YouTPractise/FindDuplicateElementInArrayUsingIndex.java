package YouTPractise;

public class FindDuplicateElementInArrayUsingIndex {

	public static void main(String[] args) {
	
		int arr[]= {2,5,7,8,8,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}

	}

}
